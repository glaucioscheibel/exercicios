package com.github.glaucioscheibel.nosql.chavevalor;

import redis.clients.jedis.Jedis;

public class Exercicio05 {
    public static void main(String[] args) {
        String[] nomes = {
            "Adalberto", "Bianca", "Celso", "Diana", "Edson", "Fiona", "Gilberto", "Helena", "Igor", "Josefina"
        };
        Jedis jedis = new Jedis("localhost", 6379);
        jedis.sadd("setusuarios", nomes);
        System.out.printf("Tamanho da set: %s\n", jedis.scard("setusuarios"));
        System.out.printf("Usuários na set: %s\n", jedis.smembers("setusuarios"));
        jedis.close();
    }
}
