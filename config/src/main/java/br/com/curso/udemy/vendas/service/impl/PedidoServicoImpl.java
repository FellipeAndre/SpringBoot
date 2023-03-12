package br.com.curso.udemy.vendas.service.impl;

import org.springframework.stereotype.Service;

import br.com.curso.udemy.vendas.entity.Pedido;
import br.com.curso.udemy.vendas.repository.ClienteRepositoryImpl;
import br.com.curso.udemy.vendas.repository.ItemPedidoRepositoryImpl;
import br.com.curso.udemy.vendas.repository.PedidoRepositoryImpl;
import br.com.curso.udemy.vendas.repository.ProdutoRepositoryImpl;
import br.com.curso.udemy.vendas.rest.dto.PedidoDTO;
import br.com.curso.udemy.vendas.service.PedidoService;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class PedidoServicoImpl implements PedidoService {

	PedidoRepositoryImpl pedidoRepository;
	ClienteRepositoryImpl clienteRepository;
	ProdutoRepositoryImpl produtoRepository;
	ItemPedidoRepositoryImpl itemRepository;

	public PedidoServicoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pedido salvar(PedidoDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}
}
