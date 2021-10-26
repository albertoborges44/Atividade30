package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DepartamentosPorFuncionarios {
	
	@Id
	@Column(name = "DeptoPorFuncID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer deptoPorFuncID;
	
	@Column(name = "FuncionarioID")
	private Integer funcionarioID;
	
	@Column(name = "DeptoID")
	private Integer deptoID;
	
	@Column(name = "DataInicial")
	private Date dataInicial;
	
	@Column(name = "DataFinal")
	private Date dataFinal;
	
	public DepartamentosPorFuncionarios() {
		
	}

	public Integer getDeptoPorFuncID() {
		return deptoPorFuncID;
	}

	public void setDeptoPorFuncID(Integer deptoPorFuncID) {
		this.deptoPorFuncID = deptoPorFuncID;
	}

	public Integer getFuncionarioID() {
		return funcionarioID;
	}

	public void setFuncionarioID(Integer funcionarioID) {
		this.funcionarioID = funcionarioID;
	}

	public Integer getDeptoID() {
		return deptoID;
	}

	public void setDeptoID(Integer deptoID) {
		this.deptoID = deptoID;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public DepartamentosPorFuncionarios(Integer deptoPorFuncID, Integer funcionarioID, Integer deptoID, Date dataInicial,
			Date dataFinal) {
		super();
		this.deptoPorFuncID = deptoPorFuncID;
		this.funcionarioID = funcionarioID;
		this.deptoID = deptoID;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	@Override
	public String toString() {
		return "Departamento [deptoPorFuncID=" + deptoPorFuncID + ", funcionarioID=" + funcionarioID + ", deptoID="
				+ deptoID + ", dataInicial=" + dataInicial + ", dataFinal=" + dataFinal + "]";
	}
	
	
	
	
}

