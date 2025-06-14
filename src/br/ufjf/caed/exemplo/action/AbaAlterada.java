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
 */
public class AbaAlterada extends Action {
    
    public String execute() {
        getView().setFormFieldValue("jtxtSelecionada", getFormFieldValue("jtpTeste"));
        return SUCCESS;
    }
    
}
