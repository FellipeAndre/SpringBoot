package br.com.curso.udemy.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.curso.udemy.vendas.entity.ItemPedido;

public interface ItemPedidoRepositoryImpl extends JpaRepository<ItemPedido, Integer> {

}
