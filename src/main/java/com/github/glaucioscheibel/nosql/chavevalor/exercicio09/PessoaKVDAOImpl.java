package com.github.glaucioscheibel.nosql.chavevalor.exercicio09;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import redis.clients.jedis.RedisClient;

public class PessoaKVDAOImpl implements PessoaDAO {
    private final RedisClient redis;

    public PessoaKVDAOImpl() {
        redis = RedisClient.create("redis://localhost:6379");
    }

    public void create(Pessoa pessoa) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream bos = new ObjectOutputStream(baos);
            bos.writeObject(pessoa);
            redis.hset("contatos3".getBytes(), intToByteArray(pessoa.getId()), baos.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(Pessoa pessoa) {
        create(pessoa);
    }

    public Pessoa read(int id) {
        Pessoa p = null;
        try {
            byte[] data = redis.hget("contatos3".getBytes(), intToByteArray(id));
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            ObjectInputStream ois = new ObjectInputStream(bis);
            p = (Pessoa) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }

    public void delete(int id) {
        redis.hdel("contatos3".getBytes(), intToByteArray(id));
    }

    private static byte[] intToByteArray(int value) {
        return new byte[] {(byte) (value >>> 24), (byte) (value >>> 16), (byte) (value >>> 8), (byte) value};
    }
}
