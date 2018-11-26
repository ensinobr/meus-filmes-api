package br.com.ensinobr.meusfilmes.repository;

import br.com.ensinobr.meusfilmes.entities.Filme;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends CrudRepository<Filme, Long>{
    
}
