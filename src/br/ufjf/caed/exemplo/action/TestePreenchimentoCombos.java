package br.ufjf.caed.exemplo.action;

import br.ufjf.caed.exemplo.model.Jornalista;
import java.util.ArrayList;
import org.dianaframework.action.Action;
import org.dianaframework.swing.view.SwingView;

/**
 *
 * Teste com o preenchimento de combos.
 *
 * @dianaframework.action
 * 
 * @dianaframework.result
 *  name="success"
 *  type="view"
 *  params="action=SHOW_VIEW;viewName=TesteCombos"
 *
 * @dianaframework.result
 *  name="error"
 *  type="dialog"
 *  params="message=Erro exibir combos preenchidos."
 *
 */
public class TestePreenchimentoCombos extends Action {
    
    public String execute() {
        // Selecionando para teste o item 3.6.2
        SwingView view = (SwingView)getView("TesteCombos");
        view.setFormFieldValue("jcmbxNivel1", "3");
        ArrayList niveis = new ArrayList();
        for (int inc = 0; inc < 10; inc++)
            niveis.add(new String[] {"Nível 3."+inc, "3."+inc});
        view.setFormFieldCollection("jcmbxNivel2", niveis);
        view.setFormFieldValue("jcmbxNivel2", "3.6");
        niveis = new ArrayList();
        for (int inc = 0; inc < 10; inc++)
            niveis.add(new String[] {"Nível 3.6."+inc, "3.6."+inc});
        view.setFormFieldCollection("jcmbxNivel3", niveis);
        view.setFormFieldValue("jcmbxNivel3", "3.6.2");
        // Testando com objetos
        Jornalista j;
        Jornalista comp;
        ArrayList<Object[]> js = new ArrayList();
        for (int inc = 0; inc < 20; inc++) {
            j = new Jornalista();
            j.setId(inc);
            j.setNome("Teste "+(inc+1));
            js.add(new Object[] {j.getNome(), j});
        }
        comp = (Jornalista)js.get(15)[1];
        view.setFormFieldCollection("jcmbxJornalistas", js);
        view.setFormFieldValue("jcmbxJornalistas", comp);
        view.enableControl("jcmbxJornalistas", false);
        view.enableControl("jbtnFechar", false);
        view.enableControl("jchkTeste", false);
        return SUCCESS;
    }
    
}
