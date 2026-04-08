package com.github.glaucioscheibel.nosql.chavevalor;

import redis.clients.jedis.DefaultJedisClientConfig;
import redis.clients.jedis.RedisClient;
import redis.clients.jedis.RedisProtocol;

public class Exercicio04 {
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
        redis.rpush("listausuarios", nomes);
        System.out.printf("Tamanho da lista: %s\n", redis.llen("listausuarios"));
        System.out.printf("Usuários na lista: %s\n", redis.lrange("listausuarios", 0, -1));
        redis.close();
    }
}
