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
 *  name="ColecaoNoticiasNaoPublicadas"
 * 
 * @dianaframework.table-model
 *  name="ColecaoNoticiasNaoPublicadas"
 *  bean="br.ufjf.caed.exemplo.model.Noticia"
 *  column-labels="Titulo"
 *  column-values="getTitulo"
 *  selected-value="getId"
 * 
 * @dianaframework.list-model 
 *  bean="br.ufjf.caed.exemplo.model.Noticia"
 *  label-method="getTitulo"
 *  value-method="getId"
 *
 */
public class ColecaoNoticiasNaoPublicadas extends BusinessObjectsCollection implements BusinessServiceClient {
private BusinessServiceFactory sf;

    public List collection() {
        try {
            ExemploBS bs = (ExemploBS)sf.getService("ExemploBS");
            return bs.getNoticiasNaoPublicadas();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void setServiceFactory(BusinessServiceFactory sf) {
        this.sf = sf;
    }

}
