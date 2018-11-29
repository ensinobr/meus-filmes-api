package br.com.ensinobr.meusfilmes.rest;

import br.com.ensinobr.meusfilmes.dto.CategoriaDto;
import br.com.ensinobr.meusfilmes.entities.Categoria;
import br.com.ensinobr.meusfilmes.services.CategoriaService;
import br.com.ensinobr.meusfilmes.utils.ConverterDtoUtils;
import java.util.Collection;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/categorias")
public class CategoriaResource {
    
    private CategoriaService categoriaService;

    public CategoriaResource(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }
    
    @PostMapping
    public ResponseEntity cadastrar(@RequestBody CategoriaDto categoriaDto){
                
        Categoria categoria = categoriaService.salvar(ConverterDtoUtils.convertCategoriaDtoToCategoria(categoriaDto));
        
        return new ResponseEntity(ConverterDtoUtils.convertCategoriaToCategoriaDto(categoria) , HttpStatus.CREATED);
    }
    
    @GetMapping
    public ResponseEntity listar(){
        
        Collection<CategoriaDto> categoriasDto = ConverterDtoUtils.convertCategoriasToCategoriasDto(categoriaService.buscarTodas());
        
        return new ResponseEntity(categoriasDto, HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity buscarPorId(@PathVariable("id") Long id){
        
        Optional<Categoria> categoria = categoriaService.buscarPorId(id);
        
        if(categoria.isPresent()){
            return new ResponseEntity(ConverterDtoUtils.convertCategoriaToCategoriaDto(categoria.get()) ,HttpStatus.OK);
        }
        
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
    
    @PutMapping
    public ResponseEntity atualizar(@RequestBody CategoriaDto categoriaDto){
        
        System.out.println("Categoria: " + categoriaDto);
        
        Categoria categoria = categoriaService.salvar(ConverterDtoUtils.convertCategoriaDtoToCategoria(categoriaDto));
        
        return new ResponseEntity(ConverterDtoUtils.convertCategoriaToCategoriaDto(categoria) ,HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity removerPorId(@PathVariable Long id){
        
        categoriaService.deletarPorId(id);
        
        return new ResponseEntity(HttpStatus.OK);
    }
}
