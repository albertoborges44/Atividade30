package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CategoriaID")
	private Integer categoriaId;
	
	@Column(name = "Descricao")
	private String descricao;
	
	@Column(name = "Inclusao", nullable = true)
	@Temporal(value = TemporalType.DATE)
	private Date dataDeInsercao;

	public Categoria() {
		
	}
	
	public Integer getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Integer categoriaId) {
		this.categoriaId = categoriaId;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataDeInsercao() {
		return dataDeInsercao;
	}

	public void setDataDeInsercao(Date dataDeInsercao) {
		this.dataDeInsercao = dataDeInsercao;
	}

	public Categoria(Integer categoriaId, String descricao, Date dataDeInsercao) {
		super();
		this.categoriaId = categoriaId;
		this.descricao = descricao;
		this.dataDeInsercao = dataDeInsercao;
	}

	@Override
	public String toString() {
		return "Categoria [CategoriaId=" + categoriaId + ", descricao=" + descricao + ", dataDeInsercao="
				+ dataDeInsercao + "]";
	}
	
	
	
	
}
