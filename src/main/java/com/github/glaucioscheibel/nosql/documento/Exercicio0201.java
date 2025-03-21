package com.github.glaucioscheibel.nosql.documento;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

public class Exercicio0201 {
    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create("mongodb://127.0.0.1:27017");
        MongoDatabase database = mongoClient.getDatabase("mflix");
        MongoCollection<Document> collection = database.getCollection("movies");
        long ini = System.currentTimeMillis();
        FindIterable<Document> docs = collection.find(Filters.eq("title", "The Room"));
        for (Document doc : docs) {
            System.out.printf("Achei: %s\n\n", doc.toJson());
        }
        System.out.printf("Achei em %d ms\n", System.currentTimeMillis() - ini);
        mongoClient.close();
    }
}
