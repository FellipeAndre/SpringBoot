package br.com.test.domain.entity;

public class Cliente {

    private Integer id;
    private String name;

    public Cliente(){
    }
    public Cliente(Integer id, String nome ){
      this.name = nome;
      this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "[Cliente -> "+ "idCliente: "+ this.getId()
                + " Nome: " + this.getName() + "]";
    }
}
