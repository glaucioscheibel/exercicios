package com.github.glaucioscheibel.nosql.chavevalor;

import redis.clients.jedis.RedisClient;

public class Exercicio01 {
    public static void main(String[] args) {
        RedisClient redis = RedisClient.create("redis://localhost:6379");
        System.out.printf("Ping: %s\n", redis.ping());
        System.out.printf("Echo: %s\n", redis.echo("Hello World!"));
        redis.close();
    }
}
