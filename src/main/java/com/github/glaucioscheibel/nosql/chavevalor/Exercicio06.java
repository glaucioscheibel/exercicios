package com.github.glaucioscheibel.nosql.chavevalor;

import java.util.Map;
import redis.clients.jedis.DefaultJedisClientConfig;
import redis.clients.jedis.RedisClient;
import redis.clients.jedis.RedisProtocol;

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
        DefaultJedisClientConfig config =
                DefaultJedisClientConfig.builder().protocol(RedisProtocol.RESP3).build();
        RedisClient redis = RedisClient.builder()
                .hostAndPort("localhost", 6379)
                .clientConfig(config)
                .build();
        redis.zadd("sortedsetusuarios", nomes);
        redis.close();
    }
}
