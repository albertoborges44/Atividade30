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

import com.example.demo.model.Funcionario;
import com.example.demo.repository.IFuncionarioRepository;

@RestController
@RequestMapping
public class FuncionarioController {
	
	@Autowired
	private IFuncionarioRepository repo;
	
	@GetMapping(path = "/funcionarios")
	public List<Funcionario> getAll(){
		return this.repo.findAll();
	}
	
	@GetMapping("/funcionarios/{id}")
	public Funcionario getById(@PathVariable int id) {
		return this.repo.findById(id).orElse(null);
	}
	
	@GetMapping("/funcionarios/greater/{num}")
	public List<Funcionario> getByFuncionarioIdGreaterThan(@PathVariable int num) {
		return this.repo.findByFuncionarioIdGreaterThan(num);
	}
	
	
	
	
	@PostMapping("/funcionarios")
	public Funcionario post(@RequestBody Funcionario funcionario) {
		funcionario.setFuncionarioId(repo.findByFuncionarioIdMax() + 1);
		return this.repo.save(funcionario);
	}
	
	@DeleteMapping("/funcionarios/{id}")
	public void delete(@PathVariable int id) {
		if(this.repo.findById(id).orElse(null) != null)
			this.repo.deleteById(id);
	}
	
	@PutMapping("/funcionarios")
	public Funcionario put(@RequestBody Funcionario novoFuncionario) {
		return this.repo.findById(novoFuncionario.getFuncionarioId())
				.map(fun -> {
					fun.setNome(novoFuncionario.getNome());
					fun.setSobreNome(novoFuncionario.getSobreNome());
					fun.setEmail(novoFuncionario.getEmail());
					fun.setCtps(novoFuncionario.getCtps());
					fun.setCtpsNum(novoFuncionario.getCtpsNum());
					fun.setCtpsSerie(novoFuncionario.getCtpsSerie());
					fun.setDataNascimento(novoFuncionario.getDataNascimento());
					fun.setPaisId(novoFuncionario.getPaisId());
					fun.setSexo(novoFuncionario.getSexo());
					return this.repo.save(fun);
				})
				.orElse(null);
	}
	
}
