package br.com.ensinobr.meusfilmes.services.impl;

import br.com.ensinobr.meusfilmes.entities.Filme;
import br.com.ensinobr.meusfilmes.repository.FilmeRepository;
import br.com.ensinobr.meusfilmes.services.FilmeService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class FilmeServiceImpl implements FilmeService {

    private FilmeRepository filmeRepository;

    public FilmeServiceImpl(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }
    
    @Override
    public Filme salvar(Filme filme) {
        return this.filmeRepository.save(filme);
    }

    @Override
    public void deletarPorId(Long id) {
        this.filmeRepository.deleteById(id);
    }

    @Override
    public Collection<Filme> buscarTodos() {
        Iterable<Filme> source = this.filmeRepository.findAll();
        List<Filme> target = new ArrayList<>();
        
        source.forEach(target::add);
        
        return target;
    }

    @Override
    public Collection<Filme> buscarPorNomeCategoria(String nomeCategoria) {
        return this.filmeRepository.findByCategoriaNome(nomeCategoria);
    }

    @Override
    public Optional<Filme> buscarPorNome(String nome) {
        List<Filme> filmes = new ArrayList(this.filmeRepository.findByNome(nome));
        
        if(filmes != null && !filmes.isEmpty()){
            return Optional.ofNullable(filmes.get(0));
        }
        
        return Optional.empty();
    }
    
}
