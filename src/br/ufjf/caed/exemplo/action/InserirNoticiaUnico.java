package br.ufjf.caed.exemplo.action;

import br.ufjf.caed.exemplo.model.Noticia;
import org.dianaframework.action.Action;
import org.dianaframework.swing.view.SwingView;

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
public class InserirNoticiaUnico extends Action {
    
    public String execute() {
        Noticia noticia = new Noticia();
        noticia.setTitulo(getFormFieldValue("jtxtfldTituloNoticia"));
        addObjectOnTable("jtblNoticias", noticia);
        
        //((SwingView)getView()).enableAction("InserirNoticiaUnico", false);
        
        return SUCCESS;
    }
    
}
