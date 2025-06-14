package br.ufjf.caed.exemplo.model;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Table(name = "jornalista", schema = "public")
public class Jornalista implements java.io.Serializable {

	private Integer id;

	private String nome;
        
        private Set<Noticia> noticias;

	@Id
        @GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "id_jornalista", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "nome", unique = false, nullable = true)
	public String getNome() {
		return this.nome ;
	}

	public void setNome (String nome) {
		this. nome  = nome;
	}

        @OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "jornalista")
        public Set<Noticia> getNoticias() {
            return noticias;
        }

        public void setNoticias(Set<Noticia> noticias) {
            this.noticias = noticias;
        }

}
