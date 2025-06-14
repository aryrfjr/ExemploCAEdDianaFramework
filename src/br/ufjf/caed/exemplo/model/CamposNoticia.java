package br.ufjf.caed.exemplo.model;

import java.util.ArrayList;
import java.util.List;
import org.dianaframework.view.BusinessObjectsCollection;

/**
 * 
 * Modelo para o preenchimento do combo com os campos para filtro de noticias.
 *
 * @dianaframework.list-model
 *
 */
public class CamposNoticia extends BusinessObjectsCollection {
    
    public List collection() {
        ArrayList campos = new ArrayList();
        campos.add(new String[] {"Título","titulo"});
        campos.add(new String[] {"Conteúdo","conteudo"});
        return campos;
    }
    
}
