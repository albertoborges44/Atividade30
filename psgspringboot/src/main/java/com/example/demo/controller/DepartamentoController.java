package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DepartamentosPorFuncionarios;

import com.example.demo.repository.IDepartamentoRepository;

@RestController
@RequestMapping(path)
public class DepartamentoController {
	
	@Autowired
	private IDepartamentoRepository repo;
	
	@GetMapping(path = "/departamentos")
	public List<DepartamentosPorFuncionarios> getAll(){
		return this.repo.findAll();
	}
	
	@GetMapping("/departamentos/{id}")
	public DepartamentosPorFuncionarios getById(@PathVariable int id) {
		return this.repo.findById(id).orElse(null);
	}
	
//	@GetMapping("/departamentos/greater/{num}")
//	public List<Departamento> getBydepartamentoIdGreaterThan(@PathVariable int num) {
//		return this.repo.findBydepartamentoIdGreaterThan(num);
//	}
//	
	
	
	
//	@PostMapping("/departamentos")
//	public Departamento post(@RequestBody Departamento departamento) {
//		departamento.setdepartamentoId(repo.findBydepartamentoIdMax() + 1);
//		return this.repo.save(departamento);
//	}
	
	@DeleteMapping("/departamentos/{id}")
	public void delete(@PathVariable int id) {
		if(this.repo.findById(id).orElse(null) != null)
			this.repo.deleteById(id);
	}
	
	@PutMapping("/departamentos")
	public DepartamentosPorFuncionarios put(@RequestBody DepartamentosPorFuncionarios novodepartamento) {
		return this.repo.findById(novodepartamento.getDeptoPorFuncID())
				.map(dep -> {
					dep.setDeptoID(novodepartamento.getDeptoID());
					dep.setFuncionarioID(novodepartamento.getFuncionarioID());
					return this.repo.save(dep);
				})
				.orElse(null);
	}
	
}
