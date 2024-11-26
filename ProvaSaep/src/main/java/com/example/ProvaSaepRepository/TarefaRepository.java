package com.example.ProvaSaepRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProvaSaepModel.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
