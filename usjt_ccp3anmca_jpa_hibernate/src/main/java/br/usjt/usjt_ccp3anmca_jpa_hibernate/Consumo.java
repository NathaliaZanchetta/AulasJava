package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_consumo")
public class Consumo {
	
	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private Conteudo conteudo;
	@ManyToOne
	private Feedback feedback;
	
	@Id
	@GeneratedValue
	private Long id;
	private Date dataHora;


	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(java.util.Date date) {
		this.dataHora = (Date) date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id; 
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Conteudo getConteudo() {
		return conteudo;
	}

	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
	}

	public Feedback getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}

}
