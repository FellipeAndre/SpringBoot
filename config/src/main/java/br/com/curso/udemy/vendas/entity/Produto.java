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
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Basic(optional = false)
	@Column(name = "id_produto")
	private Integer idProduto;
	
	@Column(name = "nameProduct")
	private String nameProduct;
	
	@Column(name = "preco_produto")
	private BigDecimal saleProduct;

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public BigDecimal getSaleProduct() {
		return saleProduct;
	}

	public void setSaleProduct(BigDecimal saleProduct) {
		this.saleProduct = saleProduct;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
}
