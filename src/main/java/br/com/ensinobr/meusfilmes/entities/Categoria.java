package br.com.ensinobr.meusfilmes.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "categorias")
@Getter @Setter @NoArgsConstructor
public class Categoria implements Serializable{
    
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private LocalDateTime dataCriacao;
	
	private LocalDateTime dataAtualizacao;
        
        @OneToMany
        @JoinColumn(name = "categoria_id")
        private Collection<Filme> filmes;
        
        @PrePersist
        private void prePersist(){
            this.dataCriacao = LocalDateTime.now();
            this.dataAtualizacao = LocalDateTime.now();
        }

        @PreUpdate
        private void preUpdate(){
            this.dataAtualizacao = LocalDateTime.now();
        }
}
