package com.github.glaucioscheibel.nosql.chavevalor.exercicio08;

import java.util.Random;
import redis.clients.jedis.UnifiedJedis;

public class Exercicio0801 {
    public static void main(String[] args) {
        Random random = new Random();
        UnifiedJedis jedis = new UnifiedJedis("redis://localhost:6379");
        boolean running = true;
        while (running) {
            int codigo = random.nextInt(999_999);
            System.out.printf("publicando %d no canal codigo:seguranca\n", codigo);
            jedis.publish("codigo:seguranca", String.valueOf(codigo));
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                running = false;
            }
        }
        jedis.close();
    }
}
