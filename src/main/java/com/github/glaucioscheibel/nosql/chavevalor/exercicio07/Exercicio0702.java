package com.github.glaucioscheibel.nosql.chavevalor.exercicio07;

import redis.clients.jedis.JedisPubSub;
import redis.clients.jedis.UnifiedJedis;

public class Exercicio0702 {
    public static void main(String[] args) {
        UnifiedJedis jedis = new UnifiedJedis("redis://localhost:6379");
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
