package br.ufjf.caed.exemplo;

import org.dianaframework.swing.DianaClient;

/**
 *
 * Classe principal da aplicacao.
 *
 * @dianaframework.persistence
 *  name="Exemplo"
 *  driver="org.postgresql.Driver"
 *  url="jdbc:postgresql://10.0.10.148/jornal"
 *  user="postgres"
 *  password="postgres"
 *  hibernate-dialect="org.hibernate.dialect.PostgreSQLDialect"
 *  hibernate-showsql="false"
 *
 */
public class Main extends DianaClient {
  
    public static void main(String[] args) {
        // TODO code application logic here
        Main main = new Main();
    }
    
}
