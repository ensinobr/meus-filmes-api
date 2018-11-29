package br.com.ensinobr.meusfilmes.services;

import br.com.ensinobr.meusfilmes.entities.Categoria;
import java.util.Collection;
import java.util.Optional;

public interface CategoriaService {
    
    Categoria salvar(Categoria categoria);
    
    void deletarPorId(Long id);
    
    Collection<Categoria> buscarTodas();
    
    Optional<Categoria>  buscarPorId(Long id);
}
