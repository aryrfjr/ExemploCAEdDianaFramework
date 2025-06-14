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
 *  params="action=UPDATE_VIEW;viewName=ListNoticias"
 *
 * @dianaframework.result
 *  name="error"
 *  type="dialog"
 *  params="message=Problemas ao visualizar a notícia."
 *
 */
public class VisualizarNoticia extends Action {
    
    public String execute() {
        Noticia noticia = (Noticia)getFormFieldSelectedObject("jlstNoticias");
        if (noticia == null) return ERROR;
        SwingView view = (SwingView)getView();
        view.setFormFieldValue("lblTitulo", noticia.getTitulo());
        view.setFormFieldValue("lblPublicada", noticia.getPublicada() != null && noticia.getPublicada() ? "sim" : "não");
        return SUCCESS;
    }
    
}
