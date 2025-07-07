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
        MongoClient mongoClient = MongoClients.create();
        MongoDatabase database = mongoClient.getDatabase("mflix");
        MongoCollection<Document> collection = database.getCollection("movies");
        FindIterable<Document> docs = collection.find(lte("runtime", 15));
        for (Document doc : docs) {
            System.out.printf("Achei: %s\n\n", doc.toJson());
        }
        mongoClient.close();
    }
}
