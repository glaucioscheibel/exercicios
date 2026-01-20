package com.github.glaucioscheibel.nosql.chavevalor.exercicio09;

import redis.clients.jedis.JedisPubSub;
import redis.clients.jedis.RedisClient;

public class Exercicio0902 {
    public static void main(String[] args) {
        RedisClient jedis = RedisClient.create("redis://localhost:6379");
        JedisPubSub subscriber = new JedisPubSub() {
            @Override
            public void onMessage(String channel, String message) {
                System.out.printf("Recebi %s do canal %s\n", message, channel);
            }
        };
        jedis.subscribe(subscriber, "codigo:seguranca");
        jedis.close();
    }
}
