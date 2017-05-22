package br.ufpr.dac.rhindo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the departamentoalocafuncionario database table.
 * 
 */
@Entity
@NamedQuery(name="Departamentoalocafuncionario.findAll", query="SELECT d FROM Departamentoalocafuncionario d")
public class DepartamentoAlocaFuncionario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date dataDesalocacao;

	//bi-directional many-to-one association to Cargoatribuidofuncionario
	@OneToMany(mappedBy="departamentoalocafuncionario")
	private List<CargoAtribuidoFuncionario> cargoAtribuidoFuncionarios;

	//bi-directional many-to-one association to Departamento
	@ManyToOne
	@JoinColumn(name="iddepartamento")
	private Departamento departamento;

	//bi-directional many-to-one association to Funcionario
	@ManyToOne
	@JoinColumn(name="idfuncionario")
	private Funcionario funcionario;

	public DepartamentoAlocaFuncionario() {
	}

	public Date getDataDesalocacao() {
		return this.dataDesalocacao;
	}

	public void setDataDesalocacao(Date dataDesalocacao) {
		this.dataDesalocacao = dataDesalocacao;
	}

	public List<CargoAtribuidoFuncionario> getCargoatribuidofuncionarios() {
		return this.cargoAtribuidoFuncionarios;
	}

	public void setCargoatribuidofuncionarios(List<CargoAtribuidoFuncionario> cargoatribuidofuncionarios) {
		this.cargoAtribuidoFuncionarios = cargoatribuidofuncionarios;
	}

	public CargoAtribuidoFuncionario addCargoatribuidofuncionario(CargoAtribuidoFuncionario cargoatribuidofuncionario) {
		getCargoatribuidofuncionarios().add(cargoatribuidofuncionario);
		cargoatribuidofuncionario.setDepartamentoalocafuncionario(this);

		return cargoatribuidofuncionario;
	}

	public CargoAtribuidoFuncionario removeCargoatribuidofuncionario(CargoAtribuidoFuncionario cargoatribuidofuncionario) {
		getCargoatribuidofuncionarios().remove(cargoatribuidofuncionario);
		cargoatribuidofuncionario.setDepartamentoalocafuncionario(null);

		return cargoatribuidofuncionario;
	}

	public Departamento getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}