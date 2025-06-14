package br.ufjf.caed.exemplo.model;

import java.io.Serializable;

/**
 * 
 * UF
 *
 * @author Ary Junior<a href="mailto:aryjunior@gmail.com">Ary Junior</a>
 *
 */
public class UF implements Serializable {
private String nome;
private String sigla;

    public UF(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String val) {
        this.nome = val;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String val) {
        this.sigla = val;
    }

}
