package com.diego.cadastro;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.diego.cadastro.domain.Usuario;
import com.diego.cadastro.repositories.UsuarioRepository;

@SpringBootApplication
public class CadastroApplication implements CommandLineRunner{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CadastroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario usu1 = new Usuario("Diego","diego@diego.com");
		
		this.usuarioRepository.saveAll(Arrays.asList(usu1));
		
	}

}
