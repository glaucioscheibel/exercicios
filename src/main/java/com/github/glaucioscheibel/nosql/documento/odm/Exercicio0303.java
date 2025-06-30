package com.github.glaucioscheibel.nosql.documento.odm;

import com.github.glaucioscheibel.nosql.documento.odm.model.Autor;
import com.mongodb.client.MongoClients;
import dev.morphia.Datastore;
import dev.morphia.Morphia;
import dev.morphia.query.Query;
import dev.morphia.query.filters.Filters;

public class Exercicio0303 {
    public static void main(String[] args) {
        Datastore datastore = Morphia.createDatastore(MongoClients.create());
        Query<Autor> query = datastore.find(Autor.class);
        query = query.filter(Filters.eq("nome", "Edgar Allan Poe"));
        Autor edgar = query.first();
        System.out.println(edgar);
    }
}
