package br.ufpr.dac.rhindo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cargoatribuidofuncionario database table.
 * 
 */
@Entity
@NamedQuery(name="Cargoatribuidofuncionario.findAll", query="SELECT c FROM Cargoatribuidofuncionario c")
public class CargoAtribuidoFuncionario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date dataDesatribuicao;

	//bi-directional many-to-one association to Cargo
	@ManyToOne
	@JoinColumn(name="idcargo")
	private Cargo cargo;

	//bi-directional many-to-one association to Departamentoalocafuncionario
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="dataalocacao", referencedColumnName="dataalocacao"),
		@JoinColumn(name="iddepartamento", referencedColumnName="iddepartamento"),
		@JoinColumn(name="idfuncionario", referencedColumnName="idfuncionario")
		})
	private DepartamentoAlocaFuncionario departamentoAlocaFuncionario;

	public CargoAtribuidoFuncionario() {
	}

	public Date getDataDesatribuicao() {
		return this.dataDesatribuicao;
	}

	public void setDataDesatribuicao(Date dataDesatribuicao) {
		this.dataDesatribuicao = dataDesatribuicao;
	}

	public Cargo getCargo() {
		return this.cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public DepartamentoAlocaFuncionario getDepartamentoalocafuncionario() {
		return this.departamentoAlocaFuncionario;
	}

	public void setDepartamentoalocafuncionario(DepartamentoAlocaFuncionario departamentoalocafuncionario) {
		this.departamentoAlocaFuncionario = departamentoalocafuncionario;
	}	

}