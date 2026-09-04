package com.github.glaucioscheibel.nosql.chavevalor.exercicio09;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import redis.clients.jedis.RedisClient;

public class PessoaDAO {
    private final RedisClient redis;

    public PessoaDAO() {
        redis = RedisClient.create("redis://localhost:6379");
    }

    public void create(Pessoa pessoa) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream bos = new ObjectOutputStream(baos);
            bos.writeObject(pessoa);
            redis.hset("contatos3".getBytes(), pessoa.getApelido().getBytes(), baos.toByteArray());
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
            byte[] data = redis.hget("contatos3".getBytes(), apelido.getBytes());
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            ObjectInputStream ois = new ObjectInputStream(bis);
            p = (Pessoa) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }

    public void delete(String apelido) {
        redis.hdel("contatos3".getBytes(), apelido.getBytes());
    }
}
