package br.com.curso.udemy.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.curso.udemy.vendas.entity.Produto;

public interface ProdutoRepositoryImpl extends JpaRepository<Produto, Integer> {

}
