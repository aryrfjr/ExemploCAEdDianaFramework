package br.ufjf.caed.exemplo.model;

// Generated 12/12/2006 17:16:16 by Hibernate Tools 3.2.0.beta8

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 */
@Entity
@Table(name = "unidadeespacial", schema = "public", uniqueConstraints = {})
public class Unidadeespacial implements java.io.Serializable {

	// Fields    

	private UnidadeespacialId id;

	private Instituicao instituicao;

	private String descricaoUnidadeespacial;

	// Constructors

	/** default constructor */
	public Unidadeespacial() {
	}

	/** minimal constructor */
	public Unidadeespacial(UnidadeespacialId id, Instituicao instituicao) {
		this.id = id;
		this.instituicao = instituicao;
	}

	/** full constructor */
	public Unidadeespacial(UnidadeespacialId id, Instituicao instituicao,
			String descricaoUnidadeespacial) {
		this.id = id;
		this.instituicao = instituicao;
		this.descricaoUnidadeespacial = descricaoUnidadeespacial;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "codInstituicao", column = @Column(name = "cod_instituicao", unique = false, nullable = false, insertable = true, updatable = true)),
			@AttributeOverride(name = "codUnidadeespacial", column = @Column(name = "cod_unidadeespacial", unique = false, nullable = false, insertable = true, updatable = true)) })
	public UnidadeespacialId getId() {
		return this.id;
	}

	public void setId(UnidadeespacialId id) {
		this.id = id;
	}

	//@ManyToOne(cascade = {}, fetch = FetchType.LAZY)
	@JoinColumn(name = "cod_instituicao", unique = false, nullable = false, insertable = false, updatable = false)
	public Instituicao getInstituicao() {
		return this.instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	@Column(name = "descricao_unidadeespacial", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
	public String getDescricaoUnidadeespacial() {
		return this.descricaoUnidadeespacial;
	}

	public void setDescricaoUnidadeespacial(String descricaoUnidadeespacial) {
		this.descricaoUnidadeespacial = descricaoUnidadeespacial;
	}

}
