package com.todo.lista.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.lista.dto.TarefaDTO;
import com.todo.lista.entity.Tarefas;
import com.todo.lista.entity.Usuario;
import com.todo.lista.enums.Prioridade;
import com.todo.lista.enums.Status;
import com.todo.lista.repository.TarefaRepository;
import com.todo.lista.repository.UsuarioRepository;

@Service
public class TarefasService {
	
	//estamos puxando o tarefarepository
	@Autowired
	TarefaRepository tarefaRepository;
	
	//estamos puxando o usuariorepository
	@Autowired
	UsuarioRepository usuarioRepository;
	
  //estamos criando um post 
	public TarefaDTO salvarTarefa(TarefaDTO dto) {
		
		Tarefas task = new Tarefas();
		
		//estamos mudando e puxando as informaçoes
		 task.setDescricao(dto.getDescricao());
		 task.setSetor(dto.getSetor());
		 task.setPrioridade(Prioridade.BAIXA);
		 task.setDataCadastro(LocalDate.now());
		 task.setStatus(Status.A_FAZER);
		
		  //aqui estamos puxando o usuario por id
		 Usuario user = usuarioRepository.getReferenceById(dto.getIdUsuario());

		 
		task.setUsuario(user);
		task = tarefaRepository.save(task);
		return new TarefaDTO(task);
		
	}
	
	//estamos criando um get aqui
	public List<Tarefas> listarTarefas(){
	List<Tarefas> tarefas = tarefaRepository.findAll();
	
	return tarefas;
	}
}
