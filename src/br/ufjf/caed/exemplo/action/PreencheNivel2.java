package br.ufjf.caed.exemplo.action;

import java.util.ArrayList;
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
 *  params="action=UPDATE_VIEW"
 *
 * @dianaframework.result
 *  name="error"
 *  type="dialog"
 *  params="message=Erro ao preencher o nível 2."
 *
 */
public class PreencheNivel2 extends Action {
    
    public String execute() {
        String nivel = getFormFieldSelectedValue("jcmbxNivel1");
        ArrayList niveis = new ArrayList();
        for (int inc = 0; inc < 10; inc++) {
            niveis.add(new String[] {"Nível "+nivel+"."+inc, nivel+"."+inc});
        }
        setFormFieldCollection("jcmbxNivel2", niveis);
        return SUCCESS;
    }
    
}
