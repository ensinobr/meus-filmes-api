package br.com.ensinobr.meusfilmes.services;

import br.com.ensinobr.meusfilmes.entities.Categoria;
import br.com.ensinobr.meusfilmes.entities.Filme;
import br.com.ensinobr.meusfilmes.repository.CategoriaRepository;
import br.com.ensinobr.meusfilmes.repository.FilmeRepository;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
public class FilmeServiceTest {
    
    @Autowired
    private FilmeRepository filmeRepository;
    
    @Autowired
    private CategoriaRepository categoriaRepository;
    
    @Autowired
    private FilmeService filmeService;
    
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
    public void testSave(){
        
        Categoria categoria1 = new Categoria("Teste");
        this.categoriaRepository.save(categoria1);
        
        Filme filme = new Filme(null, "Esqueceram de mim", "Aquele la", "Filme mediano", LocalDate.now(), LocalDateTime.now(), LocalDateTime.now(), categoria1);
    
        this.filmeService.salvar(filme);
        
        Assert.assertTrue(filme.getId() != null);
    }
}
