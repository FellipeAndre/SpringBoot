package br.com.curso.udemy.vendas.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.curso.udemy.vendas.entity.Cliente;
import br.com.curso.udemy.vendas.repository.ClienteRepositoryImpl;

@RestController // Utilizando o Rest Controle para deixar mappeado uma ResponseBody de uma
				// aplicação do tipo JSON
@RequestMapping("/api")
public class ClienteController {

	private ClienteRepositoryImpl clientes;

	public ClienteController(ClienteRepositoryImpl clientes) {
		this.clientes = clientes;
	}

	@RequestMapping(value = "/cliente/ola/{hello}", method = RequestMethod.GET)
	public String HelloWorld(@PathVariable(name = "hello") String hello) {

		return String.format("Hello %s", hello);
	}

	@GetMapping(value = "/cliente/{id}")
	public Cliente getClienteFindById(@PathVariable(name = "id") Integer id) {

		Optional<Cliente> cliente = clientes.findById(id);

		if (cliente.isPresent()) {

			return cliente.get();
		}

		throw new ResponseStatusException(HttpStatus.NO_CONTENT, "Cliente não encontrado");
	}

	@PostMapping(value = "/cliente")
	@ResponseStatus(value = HttpStatus.CREATED)
	public Cliente save(@RequestBody Cliente cliente) {

		return clientes.save(cliente);

	}

	@DeleteMapping(value = "/cliente/{id}")
	public void delete(@PathVariable Integer id) {

		clientes.findById(id).map(cliente -> {
			clientes.delete(cliente);
			return cliente;
		}).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado"));

	}

	@PutMapping(value = "/cliente/{id}") // o Put método de atualização
	public void update(@PathVariable Integer id, @RequestBody Cliente cliente) {

		clientes.findById(id).map(clienteExistente -> {
			cliente.setId(clienteExistente.getId());
			cliente.setCpf(clienteExistente.getCpf());
			clientes.save(cliente);
			return clienteExistente;
		}).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado"));
	}

	@GetMapping(value = "/clientes")
	public List<Cliente> find(Cliente filtro) {

		ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreCase()
				.withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);

		Example<Cliente> example = Example.of(filtro, matcher);
		return clientes.findAll(example);
	}
}
