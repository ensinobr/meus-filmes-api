package br.com.ensinobr.meusfilmes.dto;

import br.com.ensinobr.meusfilmes.entities.Categoria;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class FilmeDto implements Serializable{
    
    private Long id;
   
    private String nome;
   
    private String diretor;
   
    private String descricao;
   
    private LocalDateTime dataCriacao;
   
    private LocalDateTime dataAtualizacao;
    
    private Categoria categoria;
}
