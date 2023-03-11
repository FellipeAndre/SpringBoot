package br.com.curso.udemy.vendas.rest;

import org.springframework.web.bind.annotation.RestController;

import br.com.curso.udemy.vendas.service.PedidoService;

@RestController
public class PedidoController {

	 private PedidoService service;

	    public PedidoController(PedidoService service) {
	        this.service = service;
	    }
}
