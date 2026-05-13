package com.github.glaucioscheibel.nosql.chavevalor;

import static redis.clients.jedis.RedisProtocol.RESP3;

import redis.clients.jedis.DefaultJedisClientConfig;
import redis.clients.jedis.RedisClient;

public class Exercicio04 {
    public static void main(String[] args) {
        String[] nomes = {
            "Adalberto", "Bianca", "Celso", "Diana", "Edson", "Fiona", "Gilberto", "Helena", "Igor", "Josefina"
        };
        RedisClient redis = RedisClient.builder()
                .hostAndPort("localhost", 6379)
                .clientConfig(DefaultJedisClientConfig.builder().protocol(RESP3).build())
                .build();
        redis.rpush("listausuarios", nomes);
        System.out.printf("Tamanho da lista: %s\n", redis.llen("listausuarios"));
        System.out.printf("Usuários na lista: %s\n", redis.lrange("listausuarios", 0, -1));
        redis.close();
    }
}
