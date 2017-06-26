package br.ufpr.dac.rhindo.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the cargoatribuidofuncionario database table.
 * 
 */
@Embeddable
public class CargoAtribuidoFuncionarioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private Long idcargo;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private Long iddepartamento;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private Long idfuncionario;

	@Temporal(TemporalType.DATE)
	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private java.util.Date dataalocacao;

	public CargoAtribuidoFuncionarioPK() {
	}
	public Long getIdcargo() {
		return this.idcargo;
	}
	public void setIdcargo(Long idcargo) {
		this.idcargo = idcargo;
	}
	public Long getIddepartamento() {
		return this.iddepartamento;
	}
	public void setIddepartamento(Long iddepartamento) {
		this.iddepartamento = iddepartamento;
	}
	public Long getIdfuncionario() {
		return this.idfuncionario;
	}
	public void setIdfuncionario(Long idfuncionario) {
		this.idfuncionario = idfuncionario;
	}
	public java.util.Date getDataalocacao() {
		return this.dataalocacao;
	}
	public void setDataalocacao(java.util.Date dataalocacao) {
		this.dataalocacao = dataalocacao;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CargoAtribuidoFuncionarioPK)) {
			return false;
		}
		CargoAtribuidoFuncionarioPK castOther = (CargoAtribuidoFuncionarioPK)other;
		return 
			this.idcargo.equals(castOther.idcargo)
			&& this.iddepartamento.equals(castOther.iddepartamento)
			&& this.idfuncionario.equals(castOther.idfuncionario)
			&& this.dataalocacao.equals(castOther.dataalocacao);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idcargo.hashCode();
		hash = hash * prime + this.iddepartamento.hashCode();
		hash = hash * prime + this.idfuncionario.hashCode();
		hash = hash * prime + this.dataalocacao.hashCode();
		
		return hash;
	}
}