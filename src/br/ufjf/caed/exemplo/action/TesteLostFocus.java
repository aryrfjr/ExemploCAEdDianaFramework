package br.ufjf.caed.exemplo.action;

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
 *  params="action=UPDATE_VIEW"
 *
 */
public class TesteLostFocus extends Action {
    
    public String execute() {
        getView().setFormFieldValue("jtxtaConteudoNoticia", "Digite o conteúdo da notícia aqui!!!");
        return SUCCESS;
    }
    
}
