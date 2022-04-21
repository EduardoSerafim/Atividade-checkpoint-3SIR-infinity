package br.com.fiap.catalogoFilmes.catalogoFilmes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.com.fiap.catalogoFilmes.catalogoFilmes.controllers, br.com.fiap.catalogoFilmes.catalogoFilmes.config"})

public class CatalogoFilmesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogoFilmesApplication.class, args);
	}

}
