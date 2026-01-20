package com.github.glaucioscheibel.nosql.chavevalor;

import redis.clients.jedis.RedisClient;

public class Exercicio03 {
    public static void main(String[] args) {
        RedisClient jedis = RedisClient.create("redis://localhost:6379");
        jedis.incr("programa:execuções");
        jedis.close();
    }
}
