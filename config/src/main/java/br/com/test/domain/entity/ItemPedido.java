package br.com.test.domain.entity;

public class ItemPedido {

    private Integer idItemPedido;
    private Pedido idPedido;

    public Integer getQtdPedido() {
        return QtdPedido;
    }

    public void setQtdPedido(Integer qtdPedido) {
        QtdPedido = qtdPedido;
    }

    public Produto getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Produto idProduto) {
        this.idProduto = idProduto;
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }

    private Produto idProduto;
    private Integer QtdPedido;

    public Integer getIdItemPedido() {
        return idItemPedido;
    }

    public void setIdItemPedido(Integer idItemPedido) {
        this.idItemPedido = idItemPedido;
    }
}
