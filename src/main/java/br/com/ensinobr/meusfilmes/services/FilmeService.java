package br.com.ensinobr.meusfilmes.services;

import br.com.ensinobr.meusfilmes.entities.Filme;
import java.util.Collection;
import java.util.Optional;

public interface FilmeService{
    
    Filme salvar(Filme filme);
    
    void deletarPorId(Long id);
    
    Collection<Filme> buscarTodos();
    
    Collection<Filme> buscarPorNomeCategoria(String nomeCategoria);
    
    Optional<Filme> buscarPorNome(String nome);
}
