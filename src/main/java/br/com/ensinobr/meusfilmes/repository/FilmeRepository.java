package br.com.ensinobr.meusfilmes.repository;

import br.com.ensinobr.meusfilmes.entities.Filme;
import java.util.Collection;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends CrudRepository<Filme, Long>{
    
    Collection<Filme> findByCategoriaNome(String nomeCategoria);
    
    Collection<Filme> findByNome(String nome);
}
