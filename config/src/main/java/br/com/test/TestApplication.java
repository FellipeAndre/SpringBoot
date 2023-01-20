package br.com.test;

import br.com.test.domain.entity.Cliente;
import br.com.test.domain.entity.domain.repositorio.ClientManager;
import br.com.test.domain.entity.domain.repositorio.ClienteRefJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class TestApplication {

//    @Value("${application.name}")
//    private String applicationName;

//   @GetMapping("/hello")
//    public String helloWord(){
//        return applicationName ;
//    }

    @Bean
    public CommandLineRunner init(@Autowired ClienteRefJpa clientes){
        return args -> {
           clientes.salvar(new ClientManager(1,"Fellipe Andre"));
            clientes.salvar(new ClientManager(2,"Jaine Jesus"));
            clientes.salvar(new ClientManager(3,"Hugo Daniel"));

           List<Cliente> listarTodos = clientes.obterTodos();
            listarTodos.forEach(System.out::println);

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
