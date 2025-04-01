package com.todo.lista.dto;

import java.time.LocalDate;

import com.todo.lista.entity.Tarefas;
import com.todo.lista.enums.Prioridade;
import com.todo.lista.enums.Status;

public class TarefaDTO {

	
	  private Long id;
	  private String descricao; 
	  private String setor; 
	  
	  //estamos colocando a prioridade da tarefa
	  private  Prioridade prioridade;
	  

	  //essa linha cria a possiblidade de colocar data  
	  private  LocalDate dataCadastro;

	  //estamos criando um status para as tarefas
	  private  Status status;
       private Long idUsuario;
       
       //construtor com argumentos
	public TarefaDTO(Long id, String descricao, String setor, Prioridade prioridade, LocalDate dataCadastro,
			Status status, Long idUsuario) {
		 
		this.id = id;
		this.descricao = descricao;
		this.setor = setor;
		this.prioridade = prioridade;
		this.dataCadastro = dataCadastro;
		this.status = status;
		this.idUsuario = idUsuario;
	}
	  
	 //construtor diferente com argumentos de pegar informações
	public TarefaDTO(Tarefas entity) {
		 
		 id = entity.getId();
		 descricao = entity.getDescricao();
		 setor = entity.getSetor();
		 prioridade = entity.getPrioridade();
		 dataCadastro = entity.getDataCadastro();
		 status = entity.getStatus();
		idUsuario = entity.getUsuario().getId();
	}
	

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

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
  
}
