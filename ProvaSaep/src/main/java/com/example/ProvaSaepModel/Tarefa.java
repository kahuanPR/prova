package com.example.ProvaSaepModel;

import java.time.LocalDate;

import ch.qos.logback.core.status.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTarefa;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    @Column(nullable = false, length = 100)
    private String nomeSetor;

    @Column(nullable = false)
    private String descricaoTarefa;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Prioridade prioridade;

    @Column(nullable = false)
    private LocalDate dataCadastro;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

	public Object getUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getNomeSetor() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setNomeSetor(Object nomeSetor2) {
		// TODO Auto-generated method stub
		
	}

	public Object getDescricaoTarefa() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDescricaoTarefa(Object descricaoTarefa2) {
		// TODO Auto-generated method stub
		
	}

	public Object getPrioridade() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPrioridade(Object prioridade2) {
		// TODO Auto-generated method stub
		
	}

	public Object getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setStatus(Object status2) {
		// TODO Auto-generated method stub
		
	}
}