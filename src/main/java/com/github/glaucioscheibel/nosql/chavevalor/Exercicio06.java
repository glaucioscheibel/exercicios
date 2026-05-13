package com.github.glaucioscheibel.nosql.chavevalor;

import static redis.clients.jedis.RedisProtocol.RESP3;

import java.util.Map;
import redis.clients.jedis.DefaultJedisClientConfig;
import redis.clients.jedis.RedisClient;

public class Exercicio06 {
    public static void main(String[] args) {
        Map<String, Double> nomes = Map.of(
                "Adalberto",
                1d,
                "Bianca",
                2d,
                "Celso",
                3d,
                "Diana",
                4d,
                "Edson",
                5d,
                "Fiona",
                6d,
                "Gilberto",
                7d,
                "Helena",
                8d,
                "Igor",
                9d,
                "Josefina",
                10d);
        RedisClient redis = RedisClient.builder()
                .hostAndPort("localhost", 6379)
                .clientConfig(DefaultJedisClientConfig.builder().protocol(RESP3).build())
                .build();
        redis.zadd("sortedsetusuarios", nomes);
        redis.close();
    }
}
