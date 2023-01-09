package br.com.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class MinhaConfiguration {

    @Bean(name = "applicationName")
    public String applicationName(){
        String s = "Sistema de Vendas";
        return s;
    }
@Bean
   public CommandLineRunner executar(){
    return args -> {
        System.out.println("EXECUTANDO NO AMBIENTE DE DESENVOLVIMENTO");
    };
  }
}
