package br.com.ensinobr.meusfilmes.services.impl;

import br.com.ensinobr.meusfilmes.entities.Categoria;
import br.com.ensinobr.meusfilmes.repository.CategoriaRepository;
import br.com.ensinobr.meusfilmes.services.CategoriaService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    private CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }
    
    public Categoria salvar(Categoria categoria) {
        return this.categoriaRepository.save(categoria);
    }

    public void deletarPorId(Long id) {
        this.categoriaRepository.deleteById(id);
    }

    public Collection<Categoria> buscarTodas() {
        Iterable<Categoria> source = this.categoriaRepository.findAll();
        List<Categoria> target = new ArrayList<>();
 
        source.forEach(target::add);
 
        return target;
    }

    public Optional<Categoria> buscarPorId(Long id) {
        return this.categoriaRepository.findById(id);
    }
}
