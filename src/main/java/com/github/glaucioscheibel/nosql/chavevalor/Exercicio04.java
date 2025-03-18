package com.github.glaucioscheibel.nosql.chavevalor;

import redis.clients.jedis.UnifiedJedis;

public class Exercicio04 {
    public static void main(String[] args) {
        String[] nomes = {
            "Adalberto", "Bianca", "Celso", "Diana", "Edson", "Fiona", "Gilberto", "Helena", "Igor", "Josefina"
        };
        UnifiedJedis jedis = new UnifiedJedis("redis://localhost:6379");
        jedis.rpush("listausuarios", nomes);
        System.out.printf("Tamanho da lista: %s\n", jedis.llen("listausuarios"));
        System.out.printf("Usuários na lista: %s\n", jedis.lrange("listausuarios", 0, -1));
        jedis.close();
    }
}
