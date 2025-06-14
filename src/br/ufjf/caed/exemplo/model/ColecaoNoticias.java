package br.ufjf.caed.exemplo.model;

import br.ufjf.caed.exemplo.ExemploBS;
import java.util.List;
import org.dianaframework.servicelocator.BusinessServiceClient;
import org.dianaframework.servicelocator.BusinessServiceFactory;
import org.dianaframework.view.BusinessObjectsCollection;

/**
 * 
 * Representa o modelo para qualquer item de visao q exiba uma colecao de noticias.
 * 
 * @dianaframework.business-service-client
 *  name="ColecaoNoticias"
 * 
 * @dianaframework.table-model
 *  name="ColecaoNoticias"
 *  bean="br.ufjf.caed.exemplo.model.Noticia"
 *  column-labels="Título,Conteúdo"
 *  column-values="getTitulo,getConteudo"
 *  column-widths="300,450"
 *  selected-value="getId"
 *
 * @dianaframework.list-model
 *  bean="br.ufjf.caed.exemplo.model.Noticia"
 *  label-method="getTitulo"
 *  value-method="getTitulo"
 *
 */
public class ColecaoNoticias extends BusinessObjectsCollection implements BusinessServiceClient {
private BusinessServiceFactory sf;

    public List collection() {
        try {
            ExemploBS bs = (ExemploBS)sf.getService("ExemploBS");
            return bs.getNoticias();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void setServiceFactory(BusinessServiceFactory sf) {
        this.sf = sf;
    }

}
