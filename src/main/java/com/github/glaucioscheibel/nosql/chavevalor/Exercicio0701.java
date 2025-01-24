package com.github.glaucioscheibel.nosql.chavevalor;

import java.util.Random;
import redis.clients.jedis.Jedis;

public class Exercicio0701 {
    public static void main(String[] args) {
        Random random = new Random();
        Jedis jedis = new Jedis("localhost", 6379);
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
