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
 *  params="action=CLOSE_VIEW"
 *
 * @dianaframework.result
 *  name="error"
 *  type="dialog"
 *  params="message=Erro ao salvar as notícias publicadas."
 *
 */
public class SalvarPublicadas extends Action {
    
    public String execute() {
        ExemploBS bs = (ExemploBS)sf.getService("ExemploBS");
        try {
            // Salvando as publicadas
            Iterator<Noticia> publicadas = getView().getName().equals("TesteJLists") ? this.getListObjects("jlstPublicadas").iterator() : this.getTableObjects("jtblPublicadas").iterator();
            while (publicadas.hasNext()) {
                bs.atualizarNoticia(publicadas.next());
            }
            // Salvando as nao publicadas
            Iterator<Noticia> naoPublicadas = getView().getName().equals("TesteJLists") ? this.getListObjects("jlstNaoPublicadas").iterator() : this.getTableObjects("jtblNaoPublicadas").iterator();
            while (naoPublicadas.hasNext()) {
                bs.atualizarNoticia(naoPublicadas.next());
            }
            return SUCCESS;
        } catch(Exception e) {
            return ERROR;
        }
    }
    
}
