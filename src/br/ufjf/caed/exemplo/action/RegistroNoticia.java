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
 *  params="action=SHOW_VIEW;viewName=ManterCadastroNoticia"
 *
 * @dianaframework.result
 *  name="error"
 *  type="dialog"
 *  params="message=Erro ao incluir/alterar uma notícia."
 *
 */
public class RegistroNoticia extends Action {
    
    public String execute() {
        ExemploBS bs = (ExemploBS)sf.getService("ExemploBS");
        SwingView view = (SwingView)getView("ManterCadastroNoticia");
        view.addAttribute("acao", getParam("acao"));
        if (getParam("acao").equals("alterar")) {
            Noticia noticia = bs.getNoticia(getTableSelectedValue("jtblNoticias"));
            if (noticia == null) return ERROR;
            view.setFormFieldValue("jtxtfldIdNoticia", noticia.getId());
            view.setFormFieldValue("jtxtfldTituloNoticia", noticia.getTitulo());
            view.setFormFieldValue("jtxtaConteudoNoticia", noticia.getConteudo());
            view.setFormFieldValue("bgpOpcao", noticia.getOpcao());
            view.setFormFieldValue("jtxtJornais", noticia.getJornais());
            view.setFormFieldValue("jtxtDataPublicacao", noticia.getDataPublicacao());
            view.setFormFieldValue("jcmbxUF", noticia.getUf());
            view.setFormFieldValue("chkPublicada", noticia.getPublicada());
        } else if (getParam("acao").equals("incluir")) {
            view.setFormFieldValue("jtxtfldIdNoticia", bs.getIdNoticia());
        }
        return SUCCESS;
    }
    
}
