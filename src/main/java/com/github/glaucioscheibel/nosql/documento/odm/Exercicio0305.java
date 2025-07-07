package com.github.glaucioscheibel.nosql.documento.odm;

import static dev.morphia.query.filters.Filters.eq;
import static dev.morphia.query.updates.UpdateOperators.set;

import com.github.glaucioscheibel.nosql.documento.odm.model.Livro;
import com.mongodb.client.MongoClients;
import dev.morphia.Datastore;
import dev.morphia.Morphia;
import dev.morphia.UpdateOptions;

public class Exercicio0305 {
    public static void main(String[] args) {
        Datastore datastore = Morphia.createDatastore(MongoClients.create());
        datastore
                .find(Livro.class)
                .filter(eq("titulo", "O Corvo"))
                .update(new UpdateOptions(), set("titulo", "O Corvo e outros contos extraordinários"));
    }
}
