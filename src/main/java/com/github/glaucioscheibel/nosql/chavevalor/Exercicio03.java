package com.github.glaucioscheibel.nosql.chavevalor;

import redis.clients.jedis.DefaultJedisClientConfig;
import redis.clients.jedis.RedisClient;
import redis.clients.jedis.RedisProtocol;

public class Exercicio03 {
    public static void main(String[] args) {
        DefaultJedisClientConfig config =
                DefaultJedisClientConfig.builder().protocol(RedisProtocol.RESP3).build();
        RedisClient redis = RedisClient.builder()
                .hostAndPort("localhost", 6379)
                .clientConfig(config)
                .build();
        redis.incr("programa:execucoes");
        redis.close();
    }
}
