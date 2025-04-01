package com.todo.lista.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.lista.dto.TarefaDTO;
import com.todo.lista.entity.Tarefas;
import com.todo.lista.service.TarefasService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("tarefas")
public class TarefasController {

	@Autowired
	TarefasService tarefasService;
	
	
	//post para criar tarefas
	@PostMapping
	public ResponseEntity<TarefaDTO> CriarTarefa(@Valid @RequestBody TarefaDTO dto){
		dto = tarefasService.salvarTarefa(dto);
		return ResponseEntity.ok(dto);
		 
	}
	
	//get para poder ver as tarefas
	@GetMapping
    public ResponseEntity<List<Tarefas>> listarTarefas(){
		
		return ResponseEntity.ok(tarefasService.listarTarefas());
	}
	
}
