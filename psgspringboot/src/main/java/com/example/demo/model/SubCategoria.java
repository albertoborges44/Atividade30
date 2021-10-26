package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SubCategoria")
public class SubCategoria {
	
	@Column(name = "CategoriaID")
	private Integer categoriaId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SubCategoriaID")
	private Integer subCategoriaId;
	
	@Column(name = "Descricao")
	private String descricao;
	
	@Column(name = "Inclusao", nullable = true)
	private Date dataDeInsercao;

	public Integer getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Integer categoriaId) {
		this.categoriaId = categoriaId;
	}

	public Integer getSubCategoriaId() {
		return subCategoriaId;
	}

	public void setSubCategoriaId(Integer subCategoriaId) {
		this.subCategoriaId = subCategoriaId;
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

	public SubCategoria(Integer categoriaId, Integer subCategoriaId, String descricao, Date dataDeInsercao) {
		super();
		this.categoriaId = categoriaId;
		this.subCategoriaId = subCategoriaId;
		this.descricao = descricao;
		this.dataDeInsercao = dataDeInsercao;
	}
	
	public SubCategoria() {
		
	}

	@Override
	public String toString() {
		return "SubCategoria [CategoriaId=" + categoriaId + ", subCategoriaId=" + subCategoriaId + ", descricao="
				+ descricao + ", dataDeInsercao=" + dataDeInsercao + "]";
	}
	
	
	
	
	
	
	
	
}
