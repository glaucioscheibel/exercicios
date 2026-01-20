package com.github.glaucioscheibel.nosql.chavevalor;

import redis.clients.jedis.RedisClient;

public class Exercicio01 {
    public static void main(String[] args) {
        RedisClient jedis = RedisClient.create("redis://localhost:6379");
        System.out.printf("Ping: %s\n", jedis.ping());
        System.out.printf("Echo: %s\n", jedis.echo("Hello World!"));
        jedis.close();
    }
}
