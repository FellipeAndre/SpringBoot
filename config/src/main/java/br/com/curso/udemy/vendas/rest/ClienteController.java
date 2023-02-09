package br.com.curso.udemy.vendas.rest;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.curso.udemy.vendas.entity.Cliente;
import br.com.curso.udemy.vendas.repository.ClienteRepositoryImpl;

@Controller
@RequestMapping("/api")
public class ClienteController {

	private ClienteRepositoryImpl clientes;
	
	public ClienteController(ClienteRepositoryImpl clientes) {
		this.clientes = clientes;
	}
	
	@RequestMapping(value = "/cliente/ola/{hello}", method = RequestMethod.GET)
	@ResponseBody
	public String HelloWorld( @PathVariable(name = "hello") String hello) {
		
		return String.format("Hello %s", hello);
	}
	
	@GetMapping(value = "/cliente/{id}")
	@ResponseBody
	public ResponseEntity<Cliente> getClienteFindById( @PathVariable(name = "id") Integer id) {
		 
		Optional<Cliente> cliente = clientes.findById(id);
		ResponseEntity<Cliente> response;
		
		if(cliente.isPresent()) {
			
			response = ResponseEntity.ok(cliente.get());
			
		}else {
			response = ResponseEntity.notFound().build();
		}
		
		return response;
	}
}
