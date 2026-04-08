package com.github.glaucioscheibel.nosql.chavevalor.exercicio07;

import java.util.LinkedHashMap;
import java.util.Map;
import redis.clients.jedis.DefaultJedisClientConfig;
import redis.clients.jedis.RedisClient;
import redis.clients.jedis.RedisProtocol;

public class PessoaDAO {
    private RedisClient redis;

    public PessoaDAO() {
        DefaultJedisClientConfig config =
                DefaultJedisClientConfig.builder().protocol(RedisProtocol.RESP3).build();
        redis = RedisClient.builder()
                .hostAndPort("localhost", 6379)
                .clientConfig(config)
                .build();
    }

    public void create(Pessoa pessoa) {
        Map<String, String> data = new LinkedHashMap<>();
        if (pessoa.getNome() != null) {
            data.put("nome", pessoa.getNome());
        }
        if (pessoa.getSobrenome() != null) {
            data.put("sobrenome", pessoa.getSobrenome());
        }
        if (pessoa.getTelefone() != null) {
            data.put("telefone", pessoa.getTelefone());
        }
        data.put("idade", String.valueOf(pessoa.getIdade()));
        redis.hset("contatos:" + pessoa.getApelido(), data);
    }

    public void update(Pessoa pessoa) {
        create(pessoa);
    }

    public Pessoa read(String apelido) {
        Pessoa p = null;
        Map<String, String> data = redis.hgetAll("contatos:" + apelido);
        if (data != null && !data.isEmpty()) {
            p = new Pessoa();
            p.setApelido(apelido);
            p.setNome(data.get("nome"));
            p.setSobrenome(data.get("sobrenome"));
            p.setTelefone(data.get("telefone"));
            p.setIdade(Integer.parseInt(data.get("idade")));
        }
        return p;
    }

    public void delete(String apelido) {
        redis.del("contatos:" + apelido);
    }
}
