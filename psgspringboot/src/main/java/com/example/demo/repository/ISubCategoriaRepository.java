package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SubCategoria;

public interface ISubCategoriaRepository extends JpaRepository<SubCategoria, Integer> {
	

	List<SubCategoria> findByCategoriaId(int id);
	
}
