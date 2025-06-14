package br.ufjf.caed.exemplo;

import br.ufjf.caed.exemplo.model.Jornalista;
import br.ufjf.caed.exemplo.model.Noticia;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Classe com a logica de negocios do exemplo. 
 * E instanciada pelo Service Locator do Spring Framework.
 *
 * @dianaframework.business-service
 *  name="ExemploBS"
 *  domain-classes="br.ufjf.caed.exemplo.model.Noticia,br.ufjf.caed.exemplo.model.Jornalista"
 *  type="LOCAL"
 *
 */
public class ExemploBS extends ExemploBSBaseBS {
    
    public Jornalista getJornalista(String codJornalista) {
        return (Jornalista)daoJornalista.get(Integer.parseInt(codJornalista));
    }

    public Noticia getNoticia(String codNoticia) {
        return (Noticia)daoNoticia.get(Integer.parseInt(codNoticia));
    }

    public List getNoticias() {
        return new ArrayList(daoNoticia.query("FROM Noticia n ORDER BY n.titulo ASC"));
    }

    public List getJornalistas() {
        return new ArrayList(daoNoticia.query("FROM Jornalista j ORDER BY j.nome ASC"));
    }

    public List getNoticiasPublicadas() {
        return new ArrayList(daoNoticia.query("FROM Noticia n WHERE n.publicada = true ORDER BY n.titulo ASC"));
    }

    public List getNoticiasNaoPublicadas() {
        return new ArrayList(daoNoticia.query("FROM Noticia n WHERE n.publicada = false ORDER BY n.titulo ASC"));
    }

    public String getIdNoticia() {
        return String.valueOf(daoNoticia.getAll().size()+1);
    }

    public void excluirNoticia(Noticia noticia) {
        daoNoticia.delete(noticia);
    }

    public List filtrarNoticias(String campo, String valor) {
        return new ArrayList(daoNoticia.query("SELECT a FROM Noticia a WHERE a."+campo+" like '%"+valor+"%' ORDER BY a."+campo+" ASC"));
    }

    public List getNoticiasJornalista(String idJornalista) {
        return new ArrayList(daoNoticia.query("SELECT a FROM Noticia a WHERE a.jornalista.id = "+idJornalista));
    }

    public void salvarNoticia(Noticia noticia) throws Exception {
        daoNoticia.save(noticia);
    }
    
    public void atualizarNoticia(Noticia noticia) throws Exception {
        daoNoticia.update(noticia);
    }

}
