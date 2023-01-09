package br.com.test.service;

import br.com.test.model.Cliente;
import br.com.test.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteRepository repository;
    @Autowired
    ClienteService(ClienteRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
         this.validarCliente(cliente);
       // ClienteRepository clienterepo = new ClienteRepository(); não é uma boa pratica
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){

    }
}
