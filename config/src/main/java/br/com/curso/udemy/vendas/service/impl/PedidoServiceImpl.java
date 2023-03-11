package br.com.curso.udemy.vendas.service.impl;

import org.springframework.stereotype.Service;

import br.com.curso.udemy.vendas.repository.PedidoRepositoryImpl;
import br.com.curso.udemy.vendas.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService {

	private PedidoRepositoryImpl repository;
	
	public PedidoServiceImpl(PedidoRepositoryImpl repository) {
		this.repository = repository;
	}
}
