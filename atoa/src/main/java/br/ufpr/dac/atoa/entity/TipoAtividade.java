package br.ufpr.dac.atoa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipoatividade database table.
 * 
 */
@Entity
@NamedQuery(name="TipoAtividade.findAll", query="SELECT t FROM TipoAtividade t")
public class TipoAtividade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idtipoatividade")
	private Long id;

	private String nome;

	private String situacao;

	//bi-directional many-to-one association to Atividade
	@OneToMany(mappedBy="tipoatividade")
	private List<Atividade> atividades;

	//bi-directional many-to-one association to Departamento
	@ManyToOne
	@JoinColumn(name="iddepartamento")
	private Departamento departamento;

	public TipoAtividade() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
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

	public List<Atividade> getAtividades() {
		return this.atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}

	public Atividade addAtividade(Atividade atividade) {
		getAtividades().add(atividade);
		atividade.setTipoAtividade(this);

		return atividade;
	}

	public Atividade removeAtividade(Atividade atividade) {
		getAtividades().remove(atividade);
		atividade.setTipoAtividade(null);

		return atividade;
	}

	public Departamento getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}