package com.github.glaucioscheibel.nosql.documento.odm;

import com.github.glaucioscheibel.nosql.documento.odm.model.Autor;
import com.github.glaucioscheibel.nosql.documento.odm.model.Endereco;
import com.mongodb.client.MongoClients;
import dev.morphia.Datastore;
import dev.morphia.Morphia;

public class Exercicio0302 {
    public static void main(String[] args) throws Exception {
        Datastore datastore = Morphia.createDatastore(MongoClients.create());
        Autor autor1 = new Autor("Edgar Allan Poe");
        Endereco endereco1 = new Endereco();
        endereco1.setRua(" 7th Street");
        endereco1.setCidade("Philadelphia");
        endereco1.setTipo("redidencial");
        autor1.addEndereco(endereco1);
        datastore.save(autor1);
    }
}
