package br.ufjf.caed.exemplo.model;

// Generated 12/12/2006 17:16:16 by Hibernate Tools 3.2.0.beta8

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*
 *
 * @dianaframework.domain-class
 *  persistence="Exemplo"
 *
 */
@Entity
@Table(name = "instituicao", schema = "public", uniqueConstraints = {})
public class Instituicao implements java.io.Serializable {

	// Fields    

	private int codInstituicao;

	private String nome;

	private Set<Unidadeespacial> unidadeespacials = new HashSet<Unidadeespacial>(
			0);

	// Constructors

	/** default constructor */
	public Instituicao() {
	}

	/** minimal constructor */
	public Instituicao(int codInstituicao, String nome) {
		this.codInstituicao = codInstituicao;
		this.nome = nome;
	}

	/** full constructor */
	public Instituicao(int codInstituicao, String nome,
			Set<Unidadeespacial> unidadeespacials) {
		this.codInstituicao = codInstituicao;
		this.nome = nome;
		this.unidadeespacials = unidadeespacials;
	}

	// Property accessors
	@Id
	@Column(name = "cod_instituicao", unique = true, nullable = false, insertable = true, updatable = true)
	public int getCodInstituicao() {
		return this.codInstituicao;
	}

	public void setCodInstituicao(int codInstituicao) {
		this.codInstituicao = codInstituicao;
	}

	@Column(name = "nome", unique = false, nullable = false, insertable = true, updatable = true, length = 100)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "instituicao")
	public Set<Unidadeespacial> getUnidadeespacials() {
		return this.unidadeespacials;
	}

	public void setUnidadeespacials(Set<Unidadeespacial> unidadeespacials) {
		this.unidadeespacials = unidadeespacials;
	}

}
