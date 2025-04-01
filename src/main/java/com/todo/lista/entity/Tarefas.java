package com.todo.lista.entity;

import java.time.LocalDate;

import com.todo.lista.enums.Prioridade;
import com.todo.lista.enums.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tarefas")
public class Tarefas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  @Column(columnDefinition ="TEXT")
 	  private String descricao; 
	  private String setor; 
	  private  Prioridade prioridade;
	  private  LocalDate dataCadastro;
 	  private  Status status;
 	   
 	  //anotação muitos para um
 	  @ManyToOne
 	  @JoinColumn(name = "usuario_id")
 	  private Usuario usuario;
 	  
 	  //construtor vazio
	public Tarefas() {
		 
	}
 
  //construtor com argumentos
	public Tarefas(Long id, String descricao, String setor, Prioridade prioridade, LocalDate dataCadastro,
			Status status) {
		 
		this.id = id;
		this.descricao = descricao;
		this.setor = setor;
		this.prioridade = prioridade;
		this.dataCadastro = dataCadastro;
		this.status = status;
	}

	
	//getter e setter

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getSetor() {
		return setor;
	}


	public void setSetor(String setor) {
		this.setor = setor;
	}


	public Prioridade getPrioridade() {
		return prioridade;
	}


	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}


	public LocalDate getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

 
}
