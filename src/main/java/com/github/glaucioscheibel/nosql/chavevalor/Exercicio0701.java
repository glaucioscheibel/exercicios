package com.github.glaucioscheibel.nosql.chavevalor;

import java.util.Random;
import redis.clients.jedis.UnifiedJedis;

public class Exercicio0701 {
    public static void main(String[] args) {
        Random random = new Random();
        UnifiedJedis jedis = new UnifiedJedis("redis://localhost:6379");
        boolean running = true;
        while (running) {
            int codigo = random.nextInt();
            System.out.printf("publicando %d no canal codigo:segurança\n", codigo);
            jedis.publish("codigo:segurança", String.valueOf(codigo));
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                running = false;
            }
        }
        jedis.close();
    }
}
