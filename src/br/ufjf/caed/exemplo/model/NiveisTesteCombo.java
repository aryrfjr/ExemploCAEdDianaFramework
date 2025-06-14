package br.ufjf.caed.exemplo.model;

import java.util.ArrayList;
import java.util.List;
import org.dianaframework.view.BusinessObjectsCollection;

/**
 * 
 * Modelo para o teste com acoes em combos.
 *
 * @dianaframework.list-model
 *
 */
public class NiveisTesteCombo extends BusinessObjectsCollection {
    
    public List collection() {
        ArrayList niveis = new ArrayList();
        for (int inc = 0; inc < 10; inc++) {
            niveis.add(new String[] {"Nível "+inc, String.valueOf(inc)});
        }
        return niveis;
    }
    
}
