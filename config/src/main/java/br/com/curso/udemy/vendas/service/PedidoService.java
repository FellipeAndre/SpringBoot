package br.com.curso.udemy.vendas.service;

import br.com.curso.udemy.vendas.entity.Pedido;
import br.com.curso.udemy.vendas.rest.dto.PedidoDTO;

public interface PedidoService {
	
	 Pedido salvar( PedidoDTO dto );

}
