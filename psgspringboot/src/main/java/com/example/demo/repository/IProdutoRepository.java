package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Produto;

public interface IProdutoRepository extends JpaRepository<Produto, Integer>{
	
	List<Produto>findByCategoriaId(int catid);
	List<Produto>findBySubCategoriaId(int subid);
	
	List<Produto>findByCategoriaIdAndSubCategoriaId(int catid, int subid);
	
}
