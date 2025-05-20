package com.github.glaucioscheibel.nosql.chavevalor.exercicio08;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import redis.clients.jedis.UnifiedJedis;

public class PessoaDAO {
    private UnifiedJedis jedis;

    public PessoaDAO() {
        this.jedis = new UnifiedJedis("redis://localhost:6379");
    }

    public void create(Pessoa pessoa) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream bos = new ObjectOutputStream(baos);
            bos.writeObject(pessoa);
            jedis.set(("contatos2:" + pessoa.getApelido()).getBytes(), baos.toByteArray());
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
            byte[] data = jedis.get(("contatos2:" + apelido).getBytes());
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            ObjectInputStream ois = new ObjectInputStream(bis);
            p = (Pessoa) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }

    public void delete(String apelido) {
        jedis.del("contatos2:" + apelido);
    }
}
