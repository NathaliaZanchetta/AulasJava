package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_semana")
public class TesteDiasSemanas {
	
	 //1. Crie uma classe para representar os dias da semana. Ela deve ter um único campo,
	 //   que contém o nome do dia da semana.
	 //2. Estabeleça um relacionamento OneToOne entre ela e a classe que representa
	 //   previsões do tempo.
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false, length = 20)
	private String diaSemana;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		if (id == null) {
			if (other.getId() != null)
				return false;
		} else if (!id.equals(other.getId()))
			return false;
		return true;
	}

}
