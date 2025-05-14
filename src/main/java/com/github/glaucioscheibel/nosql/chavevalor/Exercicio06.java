package com.github.glaucioscheibel.nosql.chavevalor;

import java.util.Map;
import redis.clients.jedis.UnifiedJedis;

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
        UnifiedJedis jedis = new UnifiedJedis("redis://localhost:6379");
        jedis.zadd("sortedsetusuarios", nomes);
        jedis.close();
    }
}
