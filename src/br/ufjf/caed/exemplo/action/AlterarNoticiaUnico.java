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
public class AlterarNoticiaUnico extends Action {
    
    public String execute() {
        Noticia noticia = (Noticia)getTableSelectedObject("jtblNoticias");
        if (noticia == null) return ERROR;
        SwingView view = (SwingView)getView();
        view.setFormFieldValue("lblIdNoticia", noticia.getId());
        view.setFormFieldValue("jtxtfldTituloNoticia", noticia.getTitulo());
        boolean acoesHab = noticia.getId() == 0;
        //view.enableAction("RemoverNoticiaUnico", acoesHab);
        //view.enableAction("AtualizarNoticiaUnico", acoesHab);
        return SUCCESS;
    }
    
}
