package br.ufpr.dac.atoa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the departamento database table.
 * 
 */
@Entity
@NamedQuery(name="Departamento.findAll", query="SELECT d FROM Departamento d")
public class Departamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="iddepartamento")
	private Long id;

	private String localizacao;

	private String nome;

	private String situacao;

	//bi-directional many-to-one association to Funcionario
	@OneToMany(mappedBy="departamento")
	private List<Funcionario> funcionarios;

	//bi-directional many-to-one association to TipoAtividade
	@OneToMany(mappedBy="departamento")
	private List<TipoAtividade> tipoatividades;

	public Departamento() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocalizacao() {
		return this.localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
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

	public List<Funcionario> getFuncionarios() {
		return this.funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Funcionario addFuncionario(Funcionario funcionario) {
		getFuncionarios().add(funcionario);
		funcionario.setDepartamento(this);

		return funcionario;
	}

	public Funcionario removeFuncionario(Funcionario funcionario) {
		getFuncionarios().remove(funcionario);
		funcionario.setDepartamento(null);

		return funcionario;
	}

	public List<TipoAtividade> getTipoatividades() {
		return this.tipoatividades;
	}

	public void setTipoatividades(List<TipoAtividade> tipoatividades) {
		this.tipoatividades = tipoatividades;
	}

	public TipoAtividade addTipoatividade(TipoAtividade tipoatividade) {
		getTipoatividades().add(tipoatividade);
		tipoatividade.setDepartamento(this);

		return tipoatividade;
	}

	public TipoAtividade removeTipoatividade(TipoAtividade tipoatividade) {
		getTipoatividades().remove(tipoatividade);
		tipoatividade.setDepartamento(null);

		return tipoatividade;
	}

}