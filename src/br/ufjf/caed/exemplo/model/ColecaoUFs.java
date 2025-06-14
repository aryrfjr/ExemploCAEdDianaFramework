package br.ufjf.caed.exemplo.model;

import java.util.ArrayList;
import java.util.List;
import org.dianaframework.view.BusinessObjectsCollection;

/**
 * 
 * Representa o modelo para qualquer item de visao q exiba uma colecao de UFs.
 *
 * @dianaframework.list-model
 *  bean="br.ufjf.caed.exemplo.model.UF"
 *  label-method="getNome"
 *  value-method="getSigla"
 *
 */
public class ColecaoUFs extends BusinessObjectsCollection {
    
    public List collection() {
        ArrayList ufs = new ArrayList();
        ufs.add(new UF("Espírito Santo","ES"));
        ufs.add(new UF("Minas Gerais","MG"));
        ufs.add(new UF("Rio de Janeiro","RJ"));
        ufs.add(new UF("São Paulo","SP"));
        return ufs;
    }
    
}
