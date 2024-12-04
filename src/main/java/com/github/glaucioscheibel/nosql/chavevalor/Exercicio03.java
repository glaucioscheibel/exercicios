package com.github.glaucioscheibel.nosql.chavevalor;

import redis.clients.jedis.Jedis;

public class Exercicio03 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379);
        jedis.incr("programa:execuções");
        jedis.close();
    }
}
