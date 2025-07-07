package com.github.glaucioscheibel.nosql.documento;

import static com.mongodb.client.model.Filters.all;
import static com.mongodb.client.model.Projections.exclude;
import static com.mongodb.client.model.Projections.fields;
import static com.mongodb.client.model.Projections.include;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Exercicio0204 {
    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create();
        MongoDatabase database = mongoClient.getDatabase("mflix");
        MongoCollection<Document> collection = database.getCollection("movies");
        FindIterable<Document> docs = collection
                .find(all("genres", "Drama", "Comedy"))
                .projection(fields(include("title", "genres"), exclude("_id")));
        for (Document doc : docs) {
            System.out.printf("Achei: %s\n\n", doc.toJson());
        }
        mongoClient.close();
    }
}
