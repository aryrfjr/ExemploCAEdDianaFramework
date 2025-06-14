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
 *  params="message=Selecione uma not�cia na tabela abaixo."
 *
 * @dianaframework.result
 *  name="noticiaNaoAlteravel"
 *  type="dialog"
 *  params="message=Voce s� pode alterar not�cias ainda n�o salvas no BD."
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
