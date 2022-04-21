package br.com.fiap.catalogoFilmes.catalogoFilmes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.fiap.catalogoFilmes.catalogoFilmes.model.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Integer> {

}
