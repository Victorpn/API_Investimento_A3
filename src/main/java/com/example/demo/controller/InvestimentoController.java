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

import com.example.demo.investimentos.InvestimentoRepository;
import com.example.demo.model.Investimento;


@RestController
@RequestMapping("/investimentos")
public class InvestimentoController {

	@Autowired
	private InvestimentoRepository repo;
	
	@GetMapping
	public List<Investimento> listar(){
		return repo.findAll();
	}
	
	@PostMapping
    public Investimento criar(@RequestBody Investimento investimento) {
        return repo.save(investimento);
    }

	
	@PutMapping("/{id}")
	public Investimento atualizar(@PathVariable long id, @RequestBody Investimento novo) {
		return repo.findById(id).map(inv ->{
			inv.setNome(novo.getNome());
			inv.setPeriodo(novo.getPeriodo());
			inv.setRentabilidade(novo.getRentabilidade());
			inv.setInvestimentoInicial(novo.getInvestimentoInicial());
			return repo.save(inv);
		}).orElseThrow();
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		repo.deleteById(id);
	}
	
}
