package br.ufjf.caed.exemplo.action;

import java.util.ArrayList;
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
 *  params="action=UPDATE_VIEW"
 *
 * @dianaframework.result
 *  name="error"
 *  type="dialog"
 *  params="message=Erro ao preencher o nível 3."
 *
 */
public class PreencheNivel3 extends Action {
    
    public String execute() {
        String nivel = (String)getFormFieldSelectedObject("jcmbxNivel2");
        if (!nivel.equals("7.1")) {
            ArrayList niveis = new ArrayList();
            for (int inc = 0; inc < 10; inc++) {
                niveis.add(new String[] {"Nível "+nivel+"."+inc, nivel+"."+inc});
            }
            setFormFieldCollection("jcmbxNivel3", niveis);
            ((SwingView)getView()).enableControl("jcmbxNivel3", true);
            ((SwingView)getView()).enableControl("jrdbtnOpcao2", true);
            ((SwingView)getView()).enableControl("jbtnFechar", true);
            ((SwingView)getView()).enableControl("jchkTeste", true);
        } else {
            setFormFieldCollection("jcmbxNivel3", null);
            ((SwingView)getView()).enableControl("jcmbxNivel3", false);
            ((SwingView)getView()).enableControl("jrdbtnOpcao2", false);
            ((SwingView)getView()).enableControl("jbtnFechar", false);
            ((SwingView)getView()).enableControl("jchkTeste", false);
        }
        return SUCCESS;
    }
    
}
