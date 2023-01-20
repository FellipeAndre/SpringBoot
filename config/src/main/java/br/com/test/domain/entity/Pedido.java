package br.com.test.domain.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {

    private Integer idPedido;
    private Cliente idCliente;
    private LocalDate dataDoPedido;

    public LocalDate getDataDoPedido() {
        return dataDoPedido;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public void setDataDoPedido(LocalDate dataDoPedido) {
        this.dataDoPedido = dataDoPedido;
    }

    private BigDecimal total;

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }
}
