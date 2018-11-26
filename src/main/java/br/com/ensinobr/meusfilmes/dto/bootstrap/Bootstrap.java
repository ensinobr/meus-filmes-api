package br.com.ensinobr.meusfilmes.dto.bootstrap;

import br.com.ensinobr.meusfilmes.entities.Categoria;
import br.com.ensinobr.meusfilmes.entities.Filme;
import br.com.ensinobr.meusfilmes.repository.CategoriaRepository;
import br.com.ensinobr.meusfilmes.repository.FilmeRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent>{

    private CategoriaRepository categoriaRepository;
    
    private FilmeRepository filmeRepository;

    public Bootstrap(CategoriaRepository categoriaRepository, FilmeRepository filmeRepository) {
        this.categoriaRepository = categoriaRepository;
        this.filmeRepository = filmeRepository;
    }
    
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        /*Categoria categoria1 = new Categoria("Terror");
        Categoria categoria2 = new Categoria("Comédia");
        Categoria categoria3 = new Categoria("Ficção");
        
        categoriaRepository.save(categoria1);
        categoriaRepository.save(categoria2);
        categoriaRepository.save(categoria3); 
        
        Filme filme1 = new Filme(null, "Armagedom", "mito", "melhor filme", null, null, categoria3);
        Filme filme2 = new Filme(null, "Lagoa Azul", "mito 3", "gilme mais assistindo na seção da tarde", null, null, categoria2);

        filmeRepository.save(filme1);
        filmeRepository.save(filme2);   
        
        Collection<Filme> filmes = filmeRepository.findByNome("Armagedom");
        
        for(Filme f : filmes){
            System.out.println(f);
        }*/
    }
}
