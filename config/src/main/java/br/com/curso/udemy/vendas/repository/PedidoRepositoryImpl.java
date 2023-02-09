package br.com.curso.udemy.vendas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.curso.udemy.vendas.entity.Cliente;
import br.com.curso.udemy.vendas.entity.Pedido;

public interface PedidoRepositoryImpl extends JpaRepository<Pedido, Integer>{
	
	List<Pedido> findByCliente(Cliente cliente);

}
