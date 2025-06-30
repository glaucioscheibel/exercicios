package com.github.glaucioscheibel.nosql.documento.odm;

import com.github.glaucioscheibel.nosql.documento.odm.model.Livro;
import com.mongodb.client.MongoClients;
import dev.morphia.Datastore;
import dev.morphia.Morphia;
import dev.morphia.UpdateOptions;
import dev.morphia.query.filters.Filters;
import dev.morphia.query.updates.UpdateOperators;

public class Exercicio0305 {
    public static void main(String[] args) {
        Datastore datastore = Morphia.createDatastore(MongoClients.create());
        datastore
                .find(Livro.class)
                .filter(Filters.eq("titulo", "O Corvo"))
                .update(new UpdateOptions(), UpdateOperators.set("titulo", "O Corvo e outros contos extraordinários"));
    }
}
