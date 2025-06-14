package br.ufjf.caed.exemplo.action;

import br.ufjf.caed.exemplo.ExemploBS;
import br.ufjf.caed.exemplo.model.Noticia;
import java.util.Iterator;
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
 *  params="action=RELOAD_VIEW;viewName=CadastroNoticiasUnico"
 *
 * @dianaframework.result
 *  name="error"
 *  type="dialog"
 *  params="message=Selecione uma notícia na tabela abaixo."
 *
 */
public class SalvarNoticiasUnico extends Action {
    
    public String execute() {
        ExemploBS bs = (ExemploBS)sf.getService("ExemploBS");
        Iterator noticias = this.getTableObjects("jtblNoticias").iterator();
        Noticia noticia;
        try {
            while (noticias.hasNext()) {
                noticia = (Noticia)noticias.next();
                if (noticia.getId() == 0)
                    bs.salvarNoticia(noticia);
            }
            return SUCCESS;
        } catch(Exception e) {
            return ERROR;
        }
    }
    
}
