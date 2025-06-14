package br.ufjf.caed.exemplo.action;

import br.ufjf.caed.exemplo.model.Noticia;
import org.dianaframework.action.Action;

/**
 *
 * Prepara o formulario ( view ) para a alteracao de dados da noticia.
 *
 * @dianaframework.action
 * 
 * @dianaframework.result
 *  name="success"
 *  type="view"
 *  params="action=UPDATE_VIEW;viewName=TesteTabelas"
 *
 * @dianaframework.result
 *  name="error"
 *  type="dialog"
 *  params="message=Erro adicionar uma notícia publicada."
 *
 */
public class AdicionarPublicada extends Action {
    
    public String execute() {
        if (getView().getName().equals("TesteJLists")) {
            Noticia noticia = (Noticia)removeListSelectedObject("jlstNaoPublicadas");
            noticia.setPublicada(true);
            addObjectOnList("jlstPublicadas", noticia);
        } else {
            Noticia noticia = (Noticia)removeTableSelectedObject("jtblNaoPublicadas");
            noticia.setPublicada(true);
            addObjectOnTable("jtblPublicadas", noticia);
        }
        return SUCCESS;
    }
    
}
