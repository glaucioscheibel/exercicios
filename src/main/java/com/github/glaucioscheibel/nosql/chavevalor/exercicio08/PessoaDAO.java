package com.github.glaucioscheibel.nosql.chavevalor.exercicio08;

import static redis.clients.jedis.RedisProtocol.RESP3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import redis.clients.jedis.DefaultJedisClientConfig;
import redis.clients.jedis.RedisClient;

public class PessoaDAO {
    private RedisClient redis;

    public PessoaDAO() {
        redis = RedisClient.builder()
                .hostAndPort("localhost", 6379)
                .clientConfig(DefaultJedisClientConfig.builder().protocol(RESP3).build())
                .build();
    }

    public void create(Pessoa pessoa) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream bos = new ObjectOutputStream(baos);
            bos.writeObject(pessoa);
            redis.set(("contatos2:" + pessoa.getApelido()).getBytes(), baos.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(Pessoa pessoa) {
        create(pessoa);
    }

    public Pessoa read(String apelido) {
        Pessoa p = null;
        try {
            byte[] data = redis.get(("contatos2:" + apelido).getBytes());
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            ObjectInputStream ois = new ObjectInputStream(bis);
            p = (Pessoa) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }

    public void delete(String apelido) {
        redis.del("contatos2:" + apelido);
    }
}
