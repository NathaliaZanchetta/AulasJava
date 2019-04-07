package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cidade")
public class Cidade {
	
	@OneToMany (mappedBy = "cidade")
	private List <PrevisaoTempo> previsao;
	
	@Id
	@GeneratedValue
	private Long idCidade;
	
	@Column(nullable = false, length = 200)
	private String nomeCidade;
	
	@Column(nullable = false, length = 200)
	private String regiaoCidade;
	
	@Column(nullable = false, length = 200)
	private int latitude;
	
	@Column(nullable = false, length = 200)
	private int longitude;

	public List<PrevisaoTempo> getPrevisao() {
		return previsao;
	}

	public void setPrevisao(List<PrevisaoTempo> previsao) {
		this.previsao = previsao;
	}

	public Long getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(Long idCidade) {
		this.idCidade = idCidade;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public String getRegiaoCidade() {
		return regiaoCidade;
	}

	public void setRegiaoCidade(String regiaoCidade) {
		this.regiaoCidade = regiaoCidade;
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
		result = prime * result + ((idCidade == null) ? 0 : idCidade.hashCode());
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
		Usuario other = (Usuario) obj;
		if (idCidade == null) {
			if (other.idCidade != null)
				return false;
		} else if (!idCidade.equals(other.idCidade))
			return false;
		return true;
	}

}
