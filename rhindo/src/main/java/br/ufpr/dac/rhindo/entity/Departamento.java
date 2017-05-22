package br.ufpr.dac.rhindo.entity;

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

	//bi-directional many-to-one association to Departamentoalocafuncionario
	@OneToMany(mappedBy="departamento")
	private List<DepartamentoAlocaFuncionario> departamentoalocafuncionarios;

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

	public List<DepartamentoAlocaFuncionario> getDepartamentoalocafuncionarios() {
		return this.departamentoalocafuncionarios;
	}

	public void setDepartamentoalocafuncionarios(List<DepartamentoAlocaFuncionario> departamentoalocafuncionarios) {
		this.departamentoalocafuncionarios = departamentoalocafuncionarios;
	}

	public DepartamentoAlocaFuncionario addDepartamentoalocafuncionario(DepartamentoAlocaFuncionario departamentoalocafuncionario) {
		getDepartamentoalocafuncionarios().add(departamentoalocafuncionario);
		departamentoalocafuncionario.setDepartamento(this);

		return departamentoalocafuncionario;
	}

	public DepartamentoAlocaFuncionario removeDepartamentoalocafuncionario(DepartamentoAlocaFuncionario departamentoalocafuncionario) {
		getDepartamentoalocafuncionarios().remove(departamentoalocafuncionario);
		departamentoalocafuncionario.setDepartamento(null);

		return departamentoalocafuncionario;
	}

}