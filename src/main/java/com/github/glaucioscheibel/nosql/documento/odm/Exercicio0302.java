package com.github.glaucioscheibel.nosql.documento.odm;

import com.github.glaucioscheibel.nosql.documento.odm.model.Autor;
import com.github.glaucioscheibel.nosql.documento.odm.model.Endereco;
import com.github.glaucioscheibel.nosql.documento.odm.model.Livro;
import com.mongodb.client.MongoClients;
import dev.morphia.Datastore;
import dev.morphia.Morphia;

public class Exercicio0302 {
    public static void main(String[] args) throws Exception {
        Datastore datastore = Morphia.createDatastore(MongoClients.create());
        Livro corvo = new Livro("O Corvo");
        corvo.setAno(1845);
        corvo.setPreco(100.0);
        corvo = datastore.save(corvo);
        Autor edgar = new Autor("Edgar Allan Poe");
        Endereco endereco1 = new Endereco();
        endereco1.setRua(" 7th Street");
        endereco1.setCidade("Philadelphia");
        endereco1.setTipo("redidencial");
        edgar.addEndereco(endereco1);
        edgar.addLivro(corvo);
        datastore.save(edgar);
    }
}
