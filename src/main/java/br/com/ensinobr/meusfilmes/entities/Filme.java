package br.com.ensinobr.meusfilmes.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "filmes")
@Getter @Setter @NoArgsConstructor
public class Filme implements Serializable{
    
   @Id
   @GeneratedValue
   private Long id;
   
   private String nome;
   
   private String diretor;
   
   private String descricao;
   
   private LocalDateTime dataCriacao;
   
   private LocalDateTime dataAtualizacao;
   
   @ManyToOne
   private Categoria categoria;
}
