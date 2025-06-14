package br.ufjf.caed.exemplo.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * Classe de dominio de negocios.
 *
 * @version $Id:$
 * @author <a href="mailto:aryjunior@gmail.com">Ary Junior</a>
 *
 * @dianaframework.domain-class
 *  persistence="Exemplo"
 *
 */
@Entity
@Table(name = "noticia", schema = "public")
public class Noticia implements java.io.Serializable {

	private Integer id;

	private String titulo;

	private String conteudo;

	private Boolean publicada;
        
	private String opcao;

	private Integer jornais;

	private Date dataPublicacao;

	private String uf;
        
        private Jornalista jornalista;

	@Id
        @GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "id_noticia", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "titulo", unique = false, nullable = true)
	public String getTitulo() {
		return this.titulo ;
	}

	public void setTitulo (String titulo) {
		this. titulo  = titulo;
	}

	@Column(name = "conteudo", unique = false, nullable = true)
	public String getConteudo() {
		return this.conteudo;
	}

	public void setConteudo (String conteudo) {
		this. conteudo  = conteudo;
	}

	@Column(name = "publicada", unique = false, nullable = true)
	public Boolean getPublicada() {
		return this.publicada;
	}

	public void setPublicada (Boolean publicada) {
		this. publicada  = publicada;
	}

	@Column(name = "opcao", unique = false, nullable = true)
        public String getOpcao() {
            return opcao;
        }

        public void setOpcao(String opcao) {
            this.opcao = opcao;
        }

	@Column(name = "jornais", unique = false, nullable = true)
        public Integer getJornais() {
            return jornais;
        }

        public void setJornais(Integer jornais) {
            this.jornais = jornais;
        }

	@Temporal(TemporalType.DATE)
        @Column(name = "data_publicacao", unique = false, nullable = true)
        public Date getDataPublicacao() {
            return dataPublicacao;
        }

        public void setDataPublicacao(Date dataPublicacao) {
            this.dataPublicacao = dataPublicacao;
        }

	@Column(name = "uf", unique = false, nullable = true)
        public String getUf() {
            return uf;
        }

        public void setUf(String uf) {
            this.uf = uf;
        }

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_jornalista", unique = false, nullable = false, insertable = false, updatable = false)
        public Jornalista getJornalista() {
            return jornalista;
        }

        public void setJornalista(Jornalista jornalista) {
            this.jornalista = jornalista;
        }

}
