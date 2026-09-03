package com.github.glaucioscheibel.nosql.chavevalor;

import redis.clients.jedis.RedisClient;

public class Exercicio03 {
    void main() {
        RedisClient redis = RedisClient.create("redis://localhost:6379");
        redis.incr("programa:execucoes");
        redis.close();
    }
}
