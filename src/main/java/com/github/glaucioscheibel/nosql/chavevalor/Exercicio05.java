package com.github.glaucioscheibel.nosql.chavevalor;

import redis.clients.jedis.DefaultJedisClientConfig;
import redis.clients.jedis.RedisClient;
import redis.clients.jedis.RedisProtocol;

public class Exercicio05 {
    public static void main(String[] args) {
        String[] nomes = {
            "Adalberto", "Bianca", "Celso", "Diana", "Edson", "Fiona", "Gilberto", "Helena", "Igor", "Josefina"
        };
        DefaultJedisClientConfig config =
                DefaultJedisClientConfig.builder().protocol(RedisProtocol.RESP3).build();
        RedisClient redis = RedisClient.builder()
                .hostAndPort("localhost", 6379)
                .clientConfig(config)
                .build();
        redis.sadd("setusuarios", nomes);
        System.out.printf("Tamanho da set: %s\n", redis.scard("setusuarios"));
        System.out.printf("Usuários na set: %s\n", redis.smembers("setusuarios"));
        redis.close();
    }
}
