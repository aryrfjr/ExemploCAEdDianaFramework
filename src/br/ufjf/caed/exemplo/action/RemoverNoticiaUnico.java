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
 *  params="action=UPDATE_VIEW;viewName=CadastroNoticiasUnico"
 *
 * @dianaframework.result
 *  name="error"
 *  type="dialog"
 *  params="message=Selecione uma notícia na tabela abaixo."
 *
 */
public class RemoverNoticiaUnico extends Action {
    
    public String execute() {
        Noticia noticia = (Noticia)getTableSelectedObject("jtblNoticias");
        if (noticia.getId() == 0) {
            removeTableSelectedObject("jtblNoticias");
            return SUCCESS;
        } else {
            return "noticiaNaoRemovivel";
        }
    }
    
}
