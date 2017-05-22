package br.ufpr.dac.atoa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the atividade database table.
 * 
 */
@Entity
@NamedQuery(name="Atividade.findAll", query="SELECT a FROM Atividade a")
public class Atividade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idatividade")
	private Long id;

	private Timestamp dataHoraCadastro;

	private Timestamp dataHoraFim;

	private Timestamp dataHoraInicio;

	private Timestamp dataHoraPrevisaoFim;

	private Timestamp dataHoraPrevisaoInicio;

	private String descricao;

	//bi-directional many-to-one association to Funcionario
	@ManyToOne
	@JoinColumn(name="idfuncionario")
	private Funcionario funcionario;

	//bi-directional many-to-one association to TipoAtividade
	@ManyToOne
	@JoinColumn(name="idtipoatividade")
	private TipoAtividade tipoAtividade;

	public Atividade() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getDataHoraCadastro() {
		return this.dataHoraCadastro;
	}

	public void setDataHoraCadastro(Timestamp dataHoraCadastro) {
		this.dataHoraCadastro = dataHoraCadastro;
	}

	public Timestamp getDataHoraFim() {
		return this.dataHoraFim;
	}

	public void setDataHoraFim(Timestamp dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}

	public Timestamp getDataHoraInicio() {
		return this.dataHoraInicio;
	}

	public void setDataHoraInicio(Timestamp dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}

	public Timestamp getDataHoraPrevisaoFim() {
		return this.dataHoraPrevisaoFim;
	}

	public void setDataHoraPrevisaoFim(Timestamp dataHoraPrevisaoFim) {
		this.dataHoraPrevisaoFim = dataHoraPrevisaoFim;
	}

	public Timestamp getDataHoraPrevisaoInicio() {
		return this.dataHoraPrevisaoInicio;
	}

	public void setDataHoraPrevisaoInicio(Timestamp dataHoraPrevisaoInicio) {
		this.dataHoraPrevisaoInicio = dataHoraPrevisaoInicio;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public TipoAtividade getTipoAtividade() {
		return this.tipoAtividade;
	}

	public void setTipoAtividade(TipoAtividade tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}

}