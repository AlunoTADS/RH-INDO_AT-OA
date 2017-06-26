package br.ufpr.dac.rhindo.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the cidade database table.
 * 
 */
@Embeddable
public class CidadePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="idcidade", unique=true, nullable=false)
	private Long id;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private Long idunidadefederativa;

	public CidadePK() {
	}
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdunidadefederativa() {
		return this.idunidadefederativa;
	}
	public void setIdunidadefederativa(Long idunidadefederativa) {
		this.idunidadefederativa = idunidadefederativa;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CidadePK)) {
			return false;
		}
		CidadePK castOther = (CidadePK)other;
		return 
			this.id.equals(castOther.id)
			&& this.idunidadefederativa.equals(castOther.idunidadefederativa);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id.hashCode();
		hash = hash * prime + this.idunidadefederativa.hashCode();
		
		return hash;
	}
}