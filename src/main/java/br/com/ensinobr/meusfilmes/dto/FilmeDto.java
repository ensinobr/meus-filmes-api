package br.com.ensinobr.meusfilmes.dto;

import java.io.Serializable;
import java.time.LocalDate;
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
    
    private LocalDate lancamento;
   
    private LocalDateTime dataCriacao;
   
    private LocalDateTime dataAtualizacao;
    
    private CategoriaDto categoria;
}
