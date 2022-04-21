package br.com.fiap.catalogoFilmes.catalogoFilmes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.catalogoFilmes.catalogoFilmes.model.Musica;

@Repository
public interface MusicaRepository extends JpaRepository<Musica, Integer>{
	
}
