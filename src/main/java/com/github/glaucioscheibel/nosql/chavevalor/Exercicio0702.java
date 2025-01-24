package com.github.glaucioscheibel.nosql.chavevalor;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

public class Exercicio0702 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379);
        JedisPubSub subscriber = new JedisPubSub() {
            @Override
            public void onMessage(String channel, String message) {
                System.out.printf("Recebi %s do canal %s\n", message, channel);
            }
        };
        jedis.subscribe(subscriber, "codigo:segurança");
        jedis.close();
    }
}
