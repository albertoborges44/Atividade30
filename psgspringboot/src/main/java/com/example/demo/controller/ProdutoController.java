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

import com.example.demo.model.Produto;
import com.example.demo.repository.*;

@RestController
@RequestMapping(path = "/api")
public class ProdutoController {

	@Autowired
	private IProdutoRepository repo;
	
	@GetMapping(path = "/produtos")
	public List<Produto> getAll(){
		return this.repo.findAll();
	}
	
	@GetMapping("/produtos/{id}")
	public Produto getById(@PathVariable int id) {
		return this.repo.findById(id).orElse(null);
	}
	
	@GetMapping(path = "/categorias/{catid}/produtos")
	public List<Produto> getPorCategoriaId(@PathVariable int catid) {
		return this.repo.findByCategoriaId(catid);
	}
	
	@GetMapping(path = "/subcategorias/{subid}/produtos")
	public List<Produto> getPorSubCategoriaId(@PathVariable int subid) {
		return this.repo.findBySubCategoriaId(subid);
	}
	
	@GetMapping(path = "categorias/{catid}/subcategorias/{subid}/produtos")
	public List<Produto> getPorCategoriaIdAndSubCategoriaId(@PathVariable int catid, int subid) {
		return this.repo.findByCategoriaIdAndSubCategoriaId(catid, subid);
	}
	
	@PostMapping("/produtos")
	public Produto post(@RequestBody Produto Produto) {
		return this.repo.save(Produto);
	}
	
	@DeleteMapping("/produtos/{id}")
	public void delete(@PathVariable int id) {
		if(this.repo.findById(id).orElse(null) != null)
			this.repo.deleteById(id);
	}
	
	@PutMapping("/produtos")
	public Produto put(@RequestBody Produto novoProduto) {
		return this.repo.findById(novoProduto.getProdutoId())
				.map(pro -> {
					pro.setCategoriaId(novoProduto.getCategoriaId());
					pro.setSubCategoriaId(novoProduto.getSubCategoriaId());
					pro.setProdutoId(novoProduto.getProdutoId());
					pro.setDescricao(novoProduto.getDescricao());
					pro.setDataDeInsercao(novoProduto.getDataDeInsercao());
					return this.repo.save(pro);
				})
				.orElse(null);
	}
	
}
