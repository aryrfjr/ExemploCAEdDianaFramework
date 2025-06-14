package br.ufjf.caed.exemplo.model;

import br.ufjf.caed.exemplo.ExemploBS;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.dianaframework.servicelocator.BusinessServiceClient;
import org.dianaframework.servicelocator.BusinessServiceFactory;
import org.dianaframework.view.BusinessObjectsCollection;

/**
 * 
 * Representa o modelo para qualquer item de visao q exiba uma colecao de jornalistas.
 * 
 * 
 * @dianaframework.business-service-client
 *  name="ColecaoJornalistas"
 * 
 * @dianaframework.list-model 
 *  bean="br.ufjf.caed.exemplo.model.Jornalista"
 *  label-method="getNome"
 *  value-method="getId"
 */
public class ColecaoJornalistas extends BusinessObjectsCollection implements BusinessServiceClient {
private BusinessServiceFactory sf;

    public List collection() {
        try {
            ExemploBS bs = (ExemploBS)sf.getService("ExemploBS");
            return bs.getJornalistas();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void setServiceFactory(BusinessServiceFactory sf) {
        this.sf = sf;
    }

}
