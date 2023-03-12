package br.com.curso.udemy.vendas.entity;

import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "PRODUTO")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "preco")
	private BigDecimal preco;

	public String getNameProduct() {
		return descricao;
	}

	public void setNameProduct(String nameProduct) {
		this.descricao = nameProduct;
	}

	public BigDecimal getSaleProduct() {
		return preco;
	}

	public void setSaleProduct(BigDecimal saleProduct) {
		this.preco = saleProduct;
	}

	public Integer getIdProduto() {
		return id;
	}

	public void setIdProduto(Integer idProduto) {
		this.id = idProduto;
	}
}
