package br.ufjf.caed.exemplo.action;

import br.ufjf.caed.exemplo.ExemploBS;
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
 *  params="action=SHOW_VIEW_LOCK_FIELDS;viewName=ManterCadastroNoticia"
 *
 * @dianaframework.result
 *  name="error"
 *  type="dialog"
 *  params="message=Selecione uma notícia na tabela abaixo."
 *
 */
public class ConsultarNoticia extends Action {
    
    public String execute() {
        ExemploBS bs = (ExemploBS)sf.getService("ExemploBS");
        Noticia noticia = bs.getNoticia(getTableSelectedValue("jtblNoticias"));
        if (noticia == null) return ERROR;
        SwingView view = (SwingView)getView("ManterCadastroNoticia");
        view.setFormFieldValue("jtxtfldIdNoticia", noticia.getId());
        view.setFormFieldValue("jtxtfldTituloNoticia", noticia.getTitulo());
        view.setFormFieldValue("jtxtaConteudoNoticia", noticia.getConteudo());
        view.setFormFieldValue("bgpOpcao", noticia.getOpcao());
        view.setFormFieldValue("jtxtJornais", noticia.getJornais());
        view.setFormFieldValue("jtxtDataPublicacao", noticia.getDataPublicacao());
        return SUCCESS;
    }
    
}
