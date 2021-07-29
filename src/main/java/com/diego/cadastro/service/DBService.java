package com.diego.cadastro.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diego.cadastro.domain.Usuario;
import com.diego.cadastro.repositories.UsuarioRepository;

@Service
public class DBService {


	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void instanciaBaseDeDados() {
		
		Usuario usu1 = new Usuario("Diego","diego@diego.com","9999-9999");
		Usuario usu2 = new Usuario("Gisele","gisele@gisele.com","8888-8888");
		Usuario usu3 = new Usuario("Pedro","pedro@pedro.com","7777-7777");
		Usuario usu4 = new Usuario("Maria","maria@maria.com","6666-6666");
		
		usuarioRepository.saveAll(Arrays.asList(usu1,usu2,usu3,usu4));
	}
}
