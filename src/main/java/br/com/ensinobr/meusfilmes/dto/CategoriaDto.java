package br.com.ensinobr.meusfilmes.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor
@ToString
public class CategoriaDto implements Serializable{
    
    private Long id;
	
    private String nome;
	
    private LocalDateTime dataCriacao;
	
    private LocalDateTime dataAtualizacao;
    
}
