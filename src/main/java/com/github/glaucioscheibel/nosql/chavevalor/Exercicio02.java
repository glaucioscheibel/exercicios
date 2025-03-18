package com.github.glaucioscheibel.nosql.chavevalor;

import java.util.Set;
import redis.clients.jedis.UnifiedJedis;

public class Exercicio02 {
    public static void main(String[] args) {
        UnifiedJedis jedis = new UnifiedJedis("redis://localhost:6379");
        for (int i = 1; i <= 10; i++) {
            jedis.set("chave" + i, "valor" + i);
        }
        Set<String> chaves = jedis.keys("*");
        for (String chave : chaves) {
            System.out.printf("%s = %s\n", chave, jedis.get(chave));
        }
        jedis.close();
    }
}
