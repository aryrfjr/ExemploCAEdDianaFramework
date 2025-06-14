package br.ufjf.caed.exemplo.action;

import br.ufjf.caed.exemplo.ExemploBS;
import br.ufjf.caed.exemplo.model.Jornalista;
import java.util.ArrayList;
import org.dianaframework.action.Action;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;

/**
 *
 * Filtra os objetos Aluno em uma tabela da visao.
 *
 * @author Ary Junior<a href="mailto:aryjunior@gmail.com">Ary Junior</a>
 *
 * @dianaframework.action
 *  transaction="PROGRAMMATIC"
 * 
 * @dianaframework.result
 *  name="success"
 *  type="view"
 *  params="action=UPDATE_VIEW"
 *
 */
public class FiltrarNoticias extends Action {
    
    public String execute() {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
                public void doInTransactionWithoutResult(TransactionStatus status) {
                    ExemploBS bs = (ExemploBS)sf.getService("ExemploBS");
                    Jornalista jornalista = bs.getJornalista(getFormFieldSelectedValue("jcmbxJornalistas"));
                    updateTableModel("jtblNoticias", new ArrayList(jornalista.getNoticias()));
                }
            }
        );
        return SUCCESS;
    }
    
    // Abaixo o exemplo sem transacao programatica
    /*public String execute() {
        String valor = getFormFieldSelectedValue("jcmbxJornalistas");
        ExemploBS bs = (ExemploBS)sf.getService("ExemploBS");
        if (valor.equals("-1")) {
            updateTableModel("jtblNoticias", bs.getNoticias());
        } else {
            updateTableModel("jtblNoticias", bs.getNoticiasJornalista(valor));
        }
        return SUCCESS;
    }*/
    
}
