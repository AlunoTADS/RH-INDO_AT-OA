package br.ufpr.dac.rhindo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the funcionario database table.
 * 
 */
@Entity
@NamedQuery(name="Funcionario.findAll", query="SELECT f FROM Funcionario f")
public class Funcionario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idfuncionario")
	private Long id;

	private String celular;

	private String cpf;

	private String email;

	private String nome;

	private String rg;

	private String senha;

	//bi-directional many-to-one association to Departamentoalocafuncionario
	@OneToMany(mappedBy="funcionario")
	private List<DepartamentoAlocaFuncionario> departamentoAlocaFuncionarios;

	//bi-directional many-to-one association to Unidadefederativa
	@ManyToOne
	@JoinColumn(name="idunidadefederativarg")
	private UnidadeFederativa unidadeFederativaRG;

	//bi-directional many-to-one association to Unidadefederativa
	@ManyToOne
	@JoinColumn(name="idunidadefederativareside")
	private UnidadeFederativa unidadeFederativaResidencia;

	//bi-directional many-to-one association to Holerite
	@OneToMany(mappedBy="funcionario")
	private List<Holerite> holerites;

	public Funcionario() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<DepartamentoAlocaFuncionario> getDepartamentoalocafuncionarios() {
		return this.departamentoAlocaFuncionarios;
	}

	public void setDepartamentoalocafuncionarios(List<DepartamentoAlocaFuncionario> departamentoalocafuncionarios) {
		this.departamentoAlocaFuncionarios = departamentoalocafuncionarios;
	}

	public DepartamentoAlocaFuncionario addDepartamentoalocafuncionario(DepartamentoAlocaFuncionario departamentoalocafuncionario) {
		getDepartamentoalocafuncionarios().add(departamentoalocafuncionario);
		departamentoalocafuncionario.setFuncionario(this);

		return departamentoalocafuncionario;
	}

	public DepartamentoAlocaFuncionario removeDepartamentoalocafuncionario(DepartamentoAlocaFuncionario departamentoalocafuncionario) {
		getDepartamentoalocafuncionarios().remove(departamentoalocafuncionario);
		departamentoalocafuncionario.setFuncionario(null);

		return departamentoalocafuncionario;
	}

	public UnidadeFederativa getUnidadefederativa1() {
		return this.unidadeFederativaRG;
	}

	public void setUnidadefederativa1(UnidadeFederativa unidadefederativa1) {
		this.unidadeFederativaRG = unidadefederativa1;
	}

	public UnidadeFederativa getUnidadefederativa2() {
		return this.unidadeFederativaResidencia;
	}

	public void setUnidadefederativa2(UnidadeFederativa unidadefederativa2) {
		this.unidadeFederativaResidencia = unidadefederativa2;
	}

	public List<Holerite> getHolerites() {
		return this.holerites;
	}

	public void setHolerites(List<Holerite> holerites) {
		this.holerites = holerites;
	}

	public Holerite addHolerite(Holerite holerite) {
		getHolerites().add(holerite);
		holerite.setFuncionario(this);

		return holerite;
	}

	public Holerite removeHolerite(Holerite holerite) {
		getHolerites().remove(holerite);
		holerite.setFuncionario(null);

		return holerite;
	}

}