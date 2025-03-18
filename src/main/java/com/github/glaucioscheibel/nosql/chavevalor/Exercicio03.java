package com.github.glaucioscheibel.nosql.chavevalor;

import redis.clients.jedis.UnifiedJedis;

public class Exercicio03 {
    public static void main(String[] args) {
        UnifiedJedis jedis = new UnifiedJedis("redis://localhost:6379");
        jedis.incr("programa:execuções");
        jedis.close();
    }
}
