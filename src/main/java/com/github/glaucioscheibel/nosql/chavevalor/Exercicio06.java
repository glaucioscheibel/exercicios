package com.github.glaucioscheibel.nosql.chavevalor;

import java.util.Map;
import redis.clients.jedis.RedisClient;

public class Exercicio06 {
    static void main() {
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
        RedisClient redis = RedisClient.create("redis://localhost:6379");
        redis.zadd("sortedsetusuarios", nomes);
        redis.close();
    }
}
