package com.github.glaucioscheibel.nosql.chavevalor.exercicio09;

import static redis.clients.jedis.RedisProtocol.RESP3;

import java.util.Random;
import redis.clients.jedis.DefaultJedisClientConfig;
import redis.clients.jedis.RedisClient;

public class Exercicio0901 {
    public static void main(String[] args) {
        Random random = new Random();
        RedisClient redis = RedisClient.builder()
                .hostAndPort("localhost", 6379)
                .clientConfig(DefaultJedisClientConfig.builder().protocol(RESP3).build())
                .build();
        boolean running = true;
        while (running) {
            int codigo = random.nextInt(999_999);
            System.out.printf("publicando %d no canal codigo:seguranca\n", codigo);
            redis.publish("codigo:seguranca", String.valueOf(codigo));
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                running = false;
            }
        }
        redis.close();
    }
}
