package br.com.curso.udemy.vendas.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.curso.udemy.vendas.rest.dto.PedidoDTO;
import br.com.curso.udemy.vendas.service.PedidoService;

@RestController
@RequestMapping(value = "api/pedidos")
public class PedidoController {
	
	 private PedidoService service;

	    public PedidoController(PedidoService service) {
	        this.service = service;
	    }

	    @PostMapping
	   public Integer save(@RequestBody PedidoDTO dto) {
		   return 0;
	   }
}
