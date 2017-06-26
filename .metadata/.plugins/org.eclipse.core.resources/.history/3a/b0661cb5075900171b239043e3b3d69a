package br.ufpr.dac.rhindo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the holerite database table.
 * 
 */
@Entity
@NamedQuery(name="Holerite.findAll", query="SELECT h FROM Holerite h")
public class Holerite implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer mes;

	private Integer ano;

	private Integer quantidadeHorasTrabalhadas;

	private BigDecimal salarioBruto;

	private BigDecimal salarioLiquido;

	//bi-directional many-to-one association to Funcionario
	@ManyToOne
	@JoinColumn(name="idfuncionario")
	private Funcionario funcionario;

	public Holerite() {
	}

	public Integer getMes() {
		return this.mes;
	}
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	public Integer getAno() {
		return this.ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getQuantidadeHorasTrabalhadas() {
		return this.quantidadeHorasTrabalhadas;
	}

	public void setQuantidadeHorasTrabalhadas(Integer quantidadeHorasTrabalhadas) {
		this.quantidadeHorasTrabalhadas = quantidadeHorasTrabalhadas;
	}

	public BigDecimal getSalarioBruto() {
		return this.salarioBruto;
	}

	public void setSalarioBruto(BigDecimal salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public BigDecimal getSalarioLiquido() {
		return this.salarioLiquido;
	}

	public void setSalarioLiquido(BigDecimal salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}