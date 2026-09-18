package com.github.glaucioscheibel.nosql.chavevalor;

import redis.clients.jedis.RedisClient;

public class Exercicio03 {
    static void main() {
        RedisClient redis = RedisClient.create("redis://localhost:6379");
        System.out.printf("execuções: %d%n", redis.incr("programa:execucoes"));
        redis.close();
    }
}
