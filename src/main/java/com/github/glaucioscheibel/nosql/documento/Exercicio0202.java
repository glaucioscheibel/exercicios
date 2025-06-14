package com.github.glaucioscheibel.nosql.documento;

import static com.mongodb.client.model.Filters.lte;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Exercicio0202 {
    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create("mongodb://127.0.0.1:27017");
        MongoDatabase database = mongoClient.getDatabase("mflix");
        MongoCollection<Document> collection = database.getCollection("movies");
        long ini = System.currentTimeMillis();
        FindIterable<Document> docs = collection.find(lte("runtime", 15));
        int count = 0;
        for (Document doc : docs) {
            System.out.printf("Achei: %s\n\n", doc.toJson());
            count++;
        }
        System.out.printf("Achei %d filmes em %d ms\n", count, System.currentTimeMillis() - ini);
        mongoClient.close();
    }
}
