package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {
	
	@Id
	@Column(name = "FuncionarioID")
	private Integer funcionarioId;
	
	@Column(name = "Chave")
	private long chaveId;
	
	@Column(name = "Nome")
	private String nome;
	
	@Column(name = "SobreNome")
	private String sobreNome;
	
	@Column(name = "DataAdmissao")
	private Date dataAdmissao;
	
	@Column(name = "Sexo")
	private String sexo;
	
	@Column(name = "DataNascimento")
	private Date dataNascimento;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "CTPS")
	private String ctps;
	
	@Column(name = "CTPSNum")
	private long ctpsNum;
	
	@Column(name = "CTPSSERIE")
	private Integer ctpsSerie;
	
	@Column(name = "PaisID")
	private Integer paisId;
	
	public Integer getFuncionarioId() {
		return funcionarioId;
	}

	public void setFuncionarioId(Integer funcionarioId) {
		this.funcionarioId = funcionarioId;
	}

	public long getChaveId() {
		return chaveId;
	}

	public void setChaveId(long chaveId) {
		this.chaveId = chaveId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	public long getCtpsNum() {
		return ctpsNum;
	}

	public void setCtpsNum(long ctpsNum) {
		this.ctpsNum = ctpsNum;
	}

	public Integer getCtpsSerie() {
		return ctpsSerie;
	}

	public void setCtpsSerie(Integer ctpsSerie) {
		this.ctpsSerie = ctpsSerie;
	}

	public Integer getPaisId() {
		return paisId;
	}

	public void setPaisId(Integer paisId) {
		this.paisId = paisId;
	}

	public Funcionario(Integer funcionarioId, long chaveId, String nome,
			String sobreNome, Date dataAdmissao, String sexo, Date dataNascimento, String email, String ctps,
			long ctpsNum, Integer ctpsSerie, Integer paisId) {
		super();
		this.funcionarioId = funcionarioId;
		this.chaveId = chaveId;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.dataAdmissao = dataAdmissao;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.ctps = ctps;
		this.ctpsNum = ctpsNum;
		this.ctpsSerie = ctpsSerie;
		this.paisId = paisId;
	}

	
	

	@Override
	public String toString() {
		return "Funcionario [funcionarioId=" + funcionarioId + ", chaveId=" + chaveId + ", nome=" + nome
				+ ", sobreNome=" + sobreNome + ", dataAdmissao=" + dataAdmissao + ", sexo=" + sexo + ", dataNascimento="
				+ dataNascimento + ", email=" + email + ", ctps=" + ctps + ", ctpsNum=" + ctpsNum + ", ctpsSerie="
				+ ctpsSerie + ", paisId=" + paisId + "]";
	}

	public Funcionario() {
		
	}
	
}
