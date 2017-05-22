package br.ufpr.dac.rhindo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the unidadefederativa database table.
 * 
 */
@Entity
@NamedQuery(name="Unidadefederativa.findAll", query="SELECT u FROM Unidadefederativa u")
public class UnidadeFederativa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idunidadefederativa")
	private Long id;

	private String nome;

	private String situacao;

	public UnidadeFederativa() {
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

	public List<Cidade> getCidades() {
		return this.cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}

	public Cidade addCidade(Cidade cidade) {
		getCidades().add(cidade);
		cidade.setUnidadefederativa(this);

		return cidade;
	}

	public Cidade removeCidade(Cidade cidade) {
		getCidades().remove(cidade);
		cidade.setUnidadefederativa(null);

		return cidade;
	}

	public List<Funcionario> getFuncionarios1() {
		return this.funcionarios1;
	}

	public void setFuncionarios1(List<Funcionario> funcionarios1) {
		this.funcionarios1 = funcionarios1;
	}

	public Funcionario addFuncionarios1(Funcionario funcionarios1) {
		getFuncionarios1().add(funcionarios1);
		funcionarios1.setUnidadefederativa1(this);

		return funcionarios1;
	}

	public Funcionario removeFuncionarios1(Funcionario funcionarios1) {
		getFuncionarios1().remove(funcionarios1);
		funcionarios1.setUnidadefederativa1(null);

		return funcionarios1;
	}

	public List<Funcionario> getFuncionarios2() {
		return this.funcionarios2;
	}

	public void setFuncionarios2(List<Funcionario> funcionarios2) {
		this.funcionarios2 = funcionarios2;
	}

	public Funcionario addFuncionarios2(Funcionario funcionarios2) {
		getFuncionarios2().add(funcionarios2);
		funcionarios2.setUnidadefederativa2(this);

		return funcionarios2;
	}

	public Funcionario removeFuncionarios2(Funcionario funcionarios2) {
		getFuncionarios2().remove(funcionarios2);
		funcionarios2.setUnidadefederativa2(null);

		return funcionarios2;
	}

}