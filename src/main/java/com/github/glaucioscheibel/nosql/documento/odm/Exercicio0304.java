package com.github.glaucioscheibel.nosql.documento.odm;

import com.github.glaucioscheibel.nosql.documento.odm.model.Autor;
import com.github.glaucioscheibel.nosql.documento.odm.model.Livro;
import com.mongodb.client.MongoClients;
import dev.morphia.Datastore;
import dev.morphia.Morphia;
import dev.morphia.query.Query;

public class Exercicio0304 {
    public static void main(String[] args) {
        Datastore datastore = Morphia.createDatastore(MongoClients.create());
        Livro gato = new Livro("O Gato Preto");
        gato.setAno(1843);
        gato = datastore.save(gato);
        Livro escaravelho = new Livro("O Escaravelho de Ouro");
        escaravelho.setAno(1862);
        escaravelho = datastore.save(escaravelho);
        Query<Autor> query = datastore.find(Autor.class);
        Autor edgar = query.first();
        edgar.addLivro(escaravelho);
        edgar.addLivro(gato);
        datastore.save(edgar);
    }
}
