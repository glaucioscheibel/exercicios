package com.github.glaucioscheibel.nosql.chavevalor;

import static redis.clients.jedis.RedisProtocol.RESP3;

import redis.clients.jedis.DefaultJedisClientConfig;
import redis.clients.jedis.RedisClient;

public class Exercicio03 {
    public static void main(String[] args) {
        RedisClient redis = RedisClient.builder()
                .hostAndPort("localhost", 6379)
                .clientConfig(DefaultJedisClientConfig.builder().protocol(RESP3).build())
                .build();
        redis.incr("programa:execucoes");
        redis.close();
    }
}
