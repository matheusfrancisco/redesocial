package model;
// Generated 01/11/2016 17:06:20 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
/**
 * Publicacao generated by hbm2java
 */
@Entity
@Table(name = "Publicacao")
public class Publicacao  implements java.io.Serializable {

    @Id
    @Column(name="cdpublicacao", unique=true, nullable=false)
    private int cdpublicacao;
     
    @ManyToOne
    @JoinColumn(name = "cdusuario")
    private Usuario usuario;
     
    @Column(name = "conteudo")
    private String conteudo;
     
    @Column(name = "data")
    private Date data;
     
   
    public Publicacao() {
    }

	
    public Publicacao(int cdpublicacao) {
        this.cdpublicacao = cdpublicacao;
    }
    public Publicacao(int cdpublicacao, Usuario usuario, String conteudo, Date data, Set publiMaterias) {
       this.cdpublicacao = cdpublicacao;
       this.usuario = usuario;
       this.conteudo = conteudo;
       this.data = data;
   
    }
   
    public int getCdpublicacao() {
        return this.cdpublicacao;
    }
    
    public void setCdpublicacao(int cdpublicacao) {
        this.cdpublicacao = cdpublicacao;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getConteudo() {
        return this.conteudo;
    }
    
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
   /* public Set getPubliMaterias() {
        return this.publiMaterias;
    }
    
    public void setPubliMaterias(Set publiMaterias) {
        this.publiMaterias = publiMaterias;
    }
*/



}


