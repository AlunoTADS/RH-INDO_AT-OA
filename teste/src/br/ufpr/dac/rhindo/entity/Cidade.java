package br.ufpr.dac.rhindo.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cidade database table.
 * 
 */
@Entity
@Table(name="cidade")
@NamedQuery(name="Cidade.findAll", query="SELECT c FROM Cidade c")
public class Cidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CidadePK id;

	@Column(length=64)
	private String nome;

	@Column(length=1)
	private String situacao;

	//bi-directional many-to-one association to UnidadeFederativa
	@ManyToOne
	@JoinColumn(name="idunidadefederativa", nullable=false, insertable=false, updatable=false)
	private UnidadeFederativa unidadefederativa;

	public Cidade() {
	}

	public CidadePK getId() {
		return this.id;
	}

	public void setId(CidadePK id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSituacao() {
		return this.situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public UnidadeFederativa getUnidadefederativa() {
		return this.unidadefederativa;
	}

	public void setUnidadefederativa(UnidadeFederativa unidadefederativa) {
		this.unidadefederativa = unidadefederativa;
	}

}