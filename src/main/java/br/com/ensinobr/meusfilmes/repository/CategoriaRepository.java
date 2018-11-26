package br.com.ensinobr.meusfilmes.repository;

import br.com.ensinobr.meusfilmes.entities.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long>{
    
}
