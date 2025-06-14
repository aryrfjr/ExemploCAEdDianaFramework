package br.ufjf.caed.exemplo.action;

import br.ufjf.caed.exemplo.ExemploBS;
import br.ufjf.caed.exemplo.model.Noticia;
import org.dianaframework.swing.view.SwingView;

/**
 *
 * Prepara o formulario ( view ) para a alteracao de dados da noticia.
 *
 * @dianaframework.action
 *  validated-fields="jtxtfldTituloNoticia,jtxtaConteudoNoticia"
 * 
 * @dianaframework.result
 *  name="success"
 *  type="view"
 *  params="viewName=NoticiasCadastradas;action=CLOSE_VIEW_RELOAD_MODEL"
 *
 * @dianaframework.result
 *  name="error"
 *  type="dialog"
 *  params="message=Erro ao gravar a notícia."
 *
 * @dianaframework.result
 *  name="input"
 *  type="validationDialog"
 *
 * @dianaframework.interceptor-ref
 *  name="basicActionStack"
 *
 */
public class SalvarNoticia extends SalvarNoticiaBaseAction {
    
    public String execute() {
        ExemploBS bs = (ExemploBS)sf.getService("ExemploBS");
        Noticia noticia = null;
        SwingView view = (SwingView)getView();
        if (view.getAttribute("acao").equals("incluir")) {
            noticia = new Noticia();
            noticia.setId(Integer.parseInt(getFormFieldValue("jtxtfldIdNoticia")));
        } else if (view.getAttribute("acao").equals("alterar")) {
            noticia = bs.getNoticia(getFormFieldValue("jtxtfldIdNoticia"));
            if (noticia == null) return ERROR;
        }
        noticia.setTitulo(getFormFieldValue("jtxtfldTituloNoticia"));
        noticia.setConteudo(getFormFieldValue("jtxtaConteudoNoticia"));
        noticia.setOpcao(getFormFieldValue("bgpOpcao"));
        noticia.setJornais(getIntegerFormFieldValue("jtxtJornais"));
        noticia.setDataPublicacao(getDateFormFieldValue("jtxtDataPublicacao"));
        noticia.setUf(getFormFieldValue("jcmbxUF"));
        noticia.setPublicada(getCheckBoxValue("chkPublicada"));
        try {
            if (view.getAttribute("acao").equals("incluir")) {
                bs.salvarNoticia(noticia);
            } else if (view.getAttribute("acao").equals("alterar")) {
                bs.atualizarNoticia(noticia);
            }
            return SUCCESS;
        } catch(Exception e) {
            return ERROR;
        }
    }
    
}
