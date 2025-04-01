package com.todo.lista.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
  
@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  
  //essa linha faz com que tenha apenas um email, tipo nao pode emails repitidos
  @Column(unique = true)
  private String email;
  
  @OneToMany(mappedBy = "usuario")
  private List<Tarefas> tarefas;  
  
   //construtor vazio
  public Usuario( ) {
 	}
  
  //construtor com argumentos
   public Usuario(Long id, String nome, String email) {
 	this.id = id;
	this.nome = nome;
	this.email = email;
   }

 
   //getter e setter
public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public List<Tarefas> getTarefas() {
	return tarefas;
}

public void setTarefas(List<Tarefas> tarefas) {
	this.tarefas = tarefas;
}
   
}
