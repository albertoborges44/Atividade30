package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Funcionario;
import com.example.demo.model.Produto;

public interface IFuncionarioRepository extends JpaRepository<Funcionario, Integer> {
	
	@Query(value = "SELECT MAX(FuncionarioID) AS MAXID from funcionario f", nativeQuery = true)
	Integer findByFuncionarioIdMax();
	
	List<Funcionario> findByFuncionarioIdGreaterThan(int num);
	
}
