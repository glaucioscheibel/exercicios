package com.github.glaucioscheibel.nosql.chavevalor;

import redis.clients.jedis.RedisClient;

public class Exercicio05 {
    public static void main(String[] args) {
        String[] nomes = {
            "Adalberto", "Bianca", "Celso", "Diana", "Edson", "Fiona", "Gilberto", "Helena", "Igor", "Josefina"
        };
        RedisClient redis = RedisClient.create("redis://localhost:6379");
        redis.sadd("setusuarios", nomes);
        System.out.printf("Tamanho da set: %s%n", redis.scard("setusuarios"));
        System.out.printf("Usuários na set: %s%n", redis.smembers("setusuarios"));
        redis.close();
    }
}
