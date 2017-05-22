package br.ufpr.dac.rhindo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the cargo database table.
 * 
 */
@Entity
@NamedQuery(name="Cargo.findAll", query="SELECT c FROM Cargo c")
public class Cargo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idcargo")
	private Long id;

	private String gerente;

	private String nome;

	private BigDecimal percentualImposto;

	private Integer quantidadeMinimaHorasMes;

	private BigDecimal salario;

	private String situacao;

	//bi-directional many-to-one association to Cargoatribuidofuncionario
	@OneToMany(mappedBy="cargo")
	private List<CargoAtribuidoFuncionario> cargoatribuidofuncionarios;

	//bi-directional many-to-many association to Requisito
	@ManyToMany(mappedBy="cargos")
	private List<Requisito> requisitos;

	public Cargo() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGerente() {
		return this.gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPercentualImposto() {
		return this.percentualImposto;
	}

	public void setPercentualImposto(BigDecimal percentualImposto) {
		this.percentualImposto = percentualImposto;
	}

	public Integer getQuantidadeMinimaHorasMes() {
		return this.quantidadeMinimaHorasMes;
	}

	public void setQuantidadeMinimaHorasMes(Integer quantidadeMinimaHorasMes) {
		this.quantidadeMinimaHorasMes = quantidadeMinimaHorasMes;
	}

	public BigDecimal getSalario() {
		return this.salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public String getSituacao() {
		return this.situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public List<CargoAtribuidoFuncionario> getCargoatribuidofuncionarios() {
		return this.cargoatribuidofuncionarios;
	}

	public void setCargoatribuidofuncionarios(List<CargoAtribuidoFuncionario> cargoatribuidofuncionarios) {
		this.cargoatribuidofuncionarios = cargoatribuidofuncionarios;
	}

	public CargoAtribuidoFuncionario addCargoatribuidofuncionario(CargoAtribuidoFuncionario cargoatribuidofuncionario) {
		getCargoatribuidofuncionarios().add(cargoatribuidofuncionario);
		cargoatribuidofuncionario.setCargo(this);

		return cargoatribuidofuncionario;
	}

	public CargoAtribuidoFuncionario removeCargoatribuidofuncionario(CargoAtribuidoFuncionario cargoatribuidofuncionario) {
		getCargoatribuidofuncionarios().remove(cargoatribuidofuncionario);
		cargoatribuidofuncionario.setCargo(null);

		return cargoatribuidofuncionario;
	}

	public List<Requisito> getRequisitos() {
		return this.requisitos;
	}

	public void setRequisitos(List<Requisito> requisitos) {
		this.requisitos = requisitos;
	}

}