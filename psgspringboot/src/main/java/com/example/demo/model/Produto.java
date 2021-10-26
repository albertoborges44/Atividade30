package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Produto")
public class Produto {
	
	@Column(name = "CategoriaID")
	private Integer categoriaId;
	
	@Column(name = "SubCategoriaID")
	private Integer subCategoriaId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ProdutoID")
	private Integer produtoId;
	
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
	
	public Integer getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Integer produtoId) {
		this.produtoId = produtoId;
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

	public Produto(Integer categoriaId, Integer subCategoriaId, Integer produtoId, String descricao, Date dataDeInsercao) {
		super();
		this.categoriaId = categoriaId;
		this.subCategoriaId = subCategoriaId;
		this.produtoId = produtoId;
		this.descricao = descricao;
		this.dataDeInsercao = dataDeInsercao;
	}
	
	public Produto() {
		
	}

	@Override
	public String toString() {
		return "Produto [categoriaId=" + categoriaId + ", subCategoriaId=" + subCategoriaId + ", produtoId=" + produtoId
				+ ", descricao=" + descricao + ", dataDeInsercao=" + dataDeInsercao + "]";
	}

	
	
	
	
	
	
	
	
	
}
