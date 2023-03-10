package br.com.curso.udemy.vendas.rest;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.curso.udemy.vendas.entity.Produto;
import br.com.curso.udemy.vendas.repository.ProdutoRepositoryImpl;

@RestController
@RequestMapping(value = "/api/produto")
public class ProdutoController {

	private ProdutoRepositoryImpl repository;

	public ProdutoController() {
		// TODO Auto-generated constructor stub
	}
    public ProdutoController(ProdutoRepositoryImpl repository) {
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public Produto save( @RequestBody Produto produto ){
        return repository.save(produto);
    }

    @PutMapping("{id}")
    @ResponseStatus(value = HttpStatus.CREATED)
    public void update( @PathVariable Integer id, @RequestBody Produto produto ){
        repository
                .findById(id)
                .map( p -> {
                   produto.setIdProduto(p.getIdProduto());
                   repository.save(produto);
                   return produto;
                }).orElseThrow( () ->
                new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Produto não encontrado."));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){
        repository
                .findById(id)
                .map( p -> {
                    repository.delete(p);
                    return Void.TYPE;
                }).orElseThrow( () ->
                new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Produto não encontrado."));
    }

    @GetMapping("{id}")
    public Produto getById(@PathVariable Integer id){
        return repository
                .findById(id)
                .orElseThrow( () ->
                new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Produto não encontrado."));
    }

    @GetMapping
    public List<Produto> find(Produto filtro ){
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(
                        ExampleMatcher.StringMatcher.CONTAINING );

        Example example = Example.of(filtro, matcher);
        return repository.findAll(example);
    }
}
