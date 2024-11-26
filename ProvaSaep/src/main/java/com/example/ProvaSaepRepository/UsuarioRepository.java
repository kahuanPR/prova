package com.example.ProvaSaepRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProvaSaepModel.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
