package br.com.ensinobr.meusfilmes.utils;

import br.com.ensinobr.meusfilmes.dto.CategoriaDto;
import br.com.ensinobr.meusfilmes.dto.FilmeDto;
import br.com.ensinobr.meusfilmes.entities.Categoria;
import br.com.ensinobr.meusfilmes.entities.Filme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ConverterDtoUtils {

    public static Categoria convertCategoriaDtoToCategoria(CategoriaDto categoriaDto){
        
        System.out.println("============ convertCategoriaDtoToCategoria ===============");
        
        Categoria categoria = new Categoria();
        categoria.setId(categoriaDto.getId());
        categoria.setNome(categoriaDto.getNome());
        categoria.setDataCriacao(categoriaDto.getDataCriacao());
        categoria.setDataAtualizacao(categoriaDto.getDataAtualizacao());
        
        System.out.println(categoria);
                
        return categoria;
    }
    
    public static CategoriaDto convertCategoriaToCategoriaDto(Categoria categoria){
        
        System.out.println("============ convertCategoriaToCategoriaDto ===============");
        
        CategoriaDto categoriaDto = new CategoriaDto();
        categoriaDto.setId(categoria.getId());
        categoriaDto.setNome(categoria.getNome());
        categoriaDto.setDataCriacao(categoria.getDataCriacao());
        categoriaDto.setDataAtualizacao(categoria.getDataAtualizacao());
        
        System.out.println(categoriaDto);
        
        return categoriaDto;
    }
    
    public static Collection<CategoriaDto> convertCategoriasToCategoriasDto(Collection<Categoria> categorias){
        
        List<CategoriaDto> categoriasDto = new ArrayList<>();
        
        categorias.forEach((categoria) -> categoriasDto.add(convertCategoriaToCategoriaDto(categoria)));
        
        return categoriasDto;
    } 
}
