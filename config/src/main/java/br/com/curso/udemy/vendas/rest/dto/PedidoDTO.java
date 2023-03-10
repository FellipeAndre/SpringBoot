package br.com.curso.udemy.vendas.rest.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PedidoDTO {

	private Integer cliente;
	private BigDecimal total;
	private List<ItemPedidoDTO> item;
}
