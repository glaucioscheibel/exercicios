package com.github.glaucioscheibel.nosql.chavevalor.exercicio09;

import static redis.clients.jedis.RedisProtocol.RESP3;

import redis.clients.jedis.DefaultJedisClientConfig;
import redis.clients.jedis.JedisPubSub;
import redis.clients.jedis.RedisClient;

public class Exercicio0902 {
    public static void main(String[] args) {
        RedisClient redis = RedisClient.builder()
                .hostAndPort("localhost", 6379)
                .clientConfig(DefaultJedisClientConfig.builder().protocol(RESP3).build())
                .build();
        JedisPubSub subscriber = new JedisPubSub() {
            @Override
            public void onMessage(String channel, String message) {
                System.out.printf("Recebi %s do canal %s\n", message, channel);
            }
        };
        redis.subscribe(subscriber, "codigo:seguranca");
        redis.close();
    }
}
