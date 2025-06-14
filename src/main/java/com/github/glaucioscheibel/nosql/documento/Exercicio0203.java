package com.github.glaucioscheibel.nosql.documento;

import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.gte;
import static com.mongodb.client.model.Filters.lte;
import static com.mongodb.client.model.Sorts.descending;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Exercicio0203 {
    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create("mongodb://127.0.0.1:27017");
        MongoDatabase database = mongoClient.getDatabase("mflix");
        MongoCollection<Document> collection = database.getCollection("movies");
        long ini = System.currentTimeMillis();
        FindIterable<Document> docs =
                collection.find(and(gte("year", 1980), lte("year", 1980))).sort(descending("imdb.rating"));
        int count = 0;
        for (Document doc : docs) {
            System.out.printf("Achei: %s\n\n", doc.toJson());
            count++;
        }
        System.out.printf("Achei %d filmes em %d ms\n", count, System.currentTimeMillis() - ini);
        mongoClient.close();
    }
}
