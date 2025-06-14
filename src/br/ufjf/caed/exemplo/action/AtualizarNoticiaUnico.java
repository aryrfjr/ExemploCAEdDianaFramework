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
 * @dianaframework.result
 *  name="noticiaNaoAlteravel"
 *  type="dialog"
 *  params="message=Voce só pode alterar notícias ainda não salvas no BD."
 *
 */
public class AtualizarNoticiaUnico extends Action {
    
    public String execute() {
        Noticia noticia = (Noticia)getTableSelectedObject("jtblNoticias");
        if (noticia.getId() == 0) {
            noticia.setTitulo(getFormFieldValue("jtxtfldTituloNoticia"));
            return SUCCESS;
        } else {
            return "noticiaNaoAlteravel";
        }
    }
    
}
