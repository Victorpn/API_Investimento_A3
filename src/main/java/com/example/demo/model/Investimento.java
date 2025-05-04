package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Investimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	private String periodo;
	private double rentabilidade;
	private double investimentoInicial;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public double getRentabilidade() {
		return rentabilidade;
	}
	public void setRentabilidade(double rentabilidade) {
		this.rentabilidade = rentabilidade;
	}
	public double getInvestimentoInicial() {
		return investimentoInicial;
	}
	public void setInvestimentoInicial(double investimentoInicial) {
		this.investimentoInicial = investimentoInicial;
	}
	

}
