package com.github.glaucioscheibel.nosql.chavevalor;

import redis.clients.jedis.UnifiedJedis;

public class Exercicio01 {
    public static void main(String[] args) {
        UnifiedJedis jedis = new UnifiedJedis("redis://localhost:6379");
        System.out.printf("Ping: %s\n", jedis.ping());
        System.out.printf("Echo: %s\n", jedis.echo("Hello World!"));
        jedis.close();
    }
}
