package com.github.glaucioscheibel.nosql.chavevalor.exercicio09;

import redis.clients.jedis.DefaultJedisClientConfig;
import redis.clients.jedis.JedisPubSub;
import redis.clients.jedis.RedisClient;
import redis.clients.jedis.RedisProtocol;

public class Exercicio0902 {
    public static void main(String[] args) {
        DefaultJedisClientConfig config =
                DefaultJedisClientConfig.builder().protocol(RedisProtocol.RESP3).build();
        RedisClient redis = RedisClient.builder()
                .hostAndPort("localhost", 6379)
                .clientConfig(config)
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
