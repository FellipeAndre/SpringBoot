package br.com.test.domain.entity;

import java.math.BigDecimal;

public class Produto {

    private Integer idProduto;
    private String nameProduct;
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
