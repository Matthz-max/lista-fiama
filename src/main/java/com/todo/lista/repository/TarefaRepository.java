package com.todo.lista.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.lista.entity.Tarefas;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefas, Long>{

}
