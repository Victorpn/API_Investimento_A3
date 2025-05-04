package com.example.demo.investimentos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Investimento;

public interface InvestimentoRepository extends JpaRepository <Investimento, Long>{

}
