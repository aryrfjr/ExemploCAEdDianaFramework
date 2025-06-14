package br.ufjf.caed.exemplo.action;

import br.ufjf.caed.exemplo.ExemploBS;
import org.dianaframework.action.Action;

/**
 *
 * Filtra os objetos Aluno em uma tabela da visao.
 *
 * @author Ary Junior<a href="mailto:aryjunior@gmail.com">Ary Junior</a>
 *
 * @dianaframework.action
 * 
 * @dianaframework.result
 *  name="success"
 *  type="view"
 *  params="action=UPDATE_VIEW"
 *
 * @dianaframework.interceptor-ref
 *  name="lockView"
 *
 */
public class PesquisarNoticias extends Action {
    
    public String execute() {
        ExemploBS bs = (ExemploBS)sf.getService("ExemploBS");
        updateTableModel("jtblNoticias", bs.filtrarNoticias(getFormFieldValue("jcmbxCampo"), getFormFieldValue("jtxtfldPalavraChave")));
        return SUCCESS;
    }
    
}
