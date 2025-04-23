package br.edu.senaisp.colegio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.edu.senaisp.colegio.model.Usuario;
import br.edu.senaisp.colegio.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository repo;

	@Autowired
	PasswordEncoder cripto;

	public Usuario gravar(Usuario u) {
		if (repo.existsByLogin(u.getLogin()))
			throw new RuntimeException("Login já Existe!");

		try {
			u.setSenha(cripto.encode(u.getSenha()));
			return repo.save(u);
		} catch (Exception e) {
			throw new RuntimeException("Erro nos valores enviados para usuário!");
		}

	}

	// alterar

	// buscarPorId

	// buscarTodos

}
