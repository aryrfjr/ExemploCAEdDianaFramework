package br.ufjf.caed.exemplo.action;

import br.ufjf.caed.exemplo.ExemploBS;
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
 *  params="action=RELOAD_VIEW"
 *
 * @dianaframework.result
 *  name="error"
 *  type="dialog"
 *  params="message=Erro ao excluir a notícia."
 *
 * @dianaframework.interceptor-ref
 *  name="confirm"
 *  params="message=Deseja excluir a notícia?"
 *
 */
public class ExcluirNoticia extends Action {
    
    public String execute() {
        ExemploBS bs = (ExemploBS)sf.getService("ExemploBS");
        Noticia noticia = bs.getNoticia(getTableSelectedValue("jtblNoticias"));
        if (noticia == null) return ERROR;
        try {
            bs.excluirNoticia(noticia);
            return SUCCESS;
        } catch(Exception e) {
            return ERROR;
        }
    }
    
}
