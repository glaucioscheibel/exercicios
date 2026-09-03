package com.github.glaucioscheibel.nosql.chavevalor.exercicio10;

import redis.clients.jedis.JedisPubSub;
import redis.clients.jedis.RedisClient;

public class Exercicio1002 {
    static void main() {
        RedisClient redis = RedisClient.create("redis://localhost:6379");
        JedisPubSub subscriber = new JedisPubSub() {
            @Override
            public void onMessage(String channel, String message) {
                System.out.printf("Recebi %s do canal %s%n", message, channel);
            }
        };
        redis.subscribe(subscriber, "codigo:seguranca");
        redis.close();
    }
}
