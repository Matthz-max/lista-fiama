package com.todo.lista.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.lista.dto.UsuarioDTO;
import com.todo.lista.entity.Usuario;
import com.todo.lista.repository.UsuarioRepository;

//isso é uma anotação de service
@Service
public class UsuarioService {

	//isso ta puxando do repository os parametros
	@Autowired
	UsuarioRepository usuarioRepository;
	
	
	//estamos criando um post do usuario aqui
	public UsuarioDTO salvar(UsuarioDTO dto) {
		//esse linha ta criando o usuario
		Usuario usuario = new Usuario();
		
		//o setNome modifica e o getnome puxa as inf
		usuario.setNome(dto.getNome());

		//o setEmail modifica e o getEmail puxa as inf
		usuario.setEmail(dto.getEmail());
		
		//esse linha ta salvando o usuario
		usuario = usuarioRepository.save(usuario);
		
		//essa linha ta retornando um novo usuario
		return new UsuarioDTO(usuario);
	}
}
