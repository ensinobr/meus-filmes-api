package br.com.ensinobr.meusfilmes.repository;

import br.com.ensinobr.meusfilmes.entities.Categoria;
import br.com.ensinobr.meusfilmes.entities.Filme;
import java.time.LocalDate;
import java.util.Collection;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class FilmeRepositoryTest {
    
    @Autowired
    private FilmeRepository filmeRepository;
    
    @Autowired
    private CategoriaRepository categoriaRepository;
    
    @Before
    public void setUp(){
                
        Categoria categoria1 = new Categoria("Terror");
        Categoria categoria2 = new Categoria("Comédia");
        Categoria categoria3 = new Categoria("Ficção");
        
        categoriaRepository.save(categoria1);
        categoriaRepository.save(categoria2);
        categoriaRepository.save(categoria3); 
        
        Filme filme1 = new Filme(null, "Armagedom", "mito", "melhor filme", LocalDate.now(), null, null, categoria3);
        Filme filme2 = new Filme(null, "Lagoa Azul", "mito 3", "gilme mais assistindo na seção da tarde", LocalDate.now() ,null, null, categoria2);

        filmeRepository.save(filme1);
        filmeRepository.save(filme2);       
    }
    
    @After
    public void tearDown(){
        filmeRepository.deleteAll();
        categoriaRepository.deleteAll();
    }
    
    @Test
    public void testFindByCategoriaNome(){
        
        Collection<Filme> filmes = filmeRepository.findByCategoriaNome("Ficção");
        
        Assert.assertEquals(filmes.size(), 1);
    }
    
    @Test
    public void testFindByNome(){
        
        Collection<Filme> filmes = filmeRepository.findByNome("Armagedom");
        
        Assert.assertEquals(filmes.size(), 1);
    }
}
