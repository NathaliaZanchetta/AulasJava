package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_PrevTempo")
public class PrevisaoTempo {
	
	@OneToOne (optional = false)
	@JoinColumn (name = "id_do_TesteDiasSemanas")
	private TesteDiasSemanas DiasSemana;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false, length = 200)
	private String descricao;
	
	@Column(nullable = false, length = 10)
	private int temperaturaMin;
	
	@Column(nullable = false, length = 10)
	private int temperaturaMax;
	
	@Column(nullable = false, length = 10)
	private float humidade;
	
	@Column(nullable = false, length = 10)
	private Date dataHora;
	
	@Column(nullable = false, length = 10)
	private int latitude;
	
	@Column(nullable = false, length = 10)
	private int longitude;

	
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

	public int getTemperaturaMin() {
		return temperaturaMin;
	}

	public void setTemperaturaMin(int temperaturaMin) {
		this.temperaturaMin = temperaturaMin;
	}

	public int getTemperaturaMax() {
		return temperaturaMax;
	}

	public void setTemperaturaMax(int temperaturaMax) {
		this.temperaturaMax = temperaturaMax;
	}

	public float getHumidade() {
		return humidade;
	}

	public void setHumidade(float humidade) {
		this.humidade = humidade;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
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
