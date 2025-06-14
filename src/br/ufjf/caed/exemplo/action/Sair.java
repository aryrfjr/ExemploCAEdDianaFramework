package br.ufjf.caed.exemplo.action;

import org.dianaframework.action.Action;

/**
 *
 * Termina o sistema.
 *
 * @author Ary Junior<a href="mailto:aryjunior@gmail.com">Ary Junior</a>
 *
 * @dianaframework.action
 * 
 */
public class Sair extends Action {

    public String execute() {
        System.exit(0);
        return SUCCESS;
    }
    
}
