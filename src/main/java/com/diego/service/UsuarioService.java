package com.diego.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.diego.cadastro.repositories.UsuarioRepository;

public class UsuarioService {
	UsuarioRepository usuarioRepository;
	
	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {this.usuarioRepository = usuarioRepository;}
}
