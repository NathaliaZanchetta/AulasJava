package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_conteudo")
public class Conteudo {
	
	
	//@ManyToMany (mappedBy = "conteudos")
	//private List <Usuario> usuarios;
	
	@OneToMany (mappedBy = "conteudo")
	private List <Consumo> consumos;
	
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	private String tipo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}