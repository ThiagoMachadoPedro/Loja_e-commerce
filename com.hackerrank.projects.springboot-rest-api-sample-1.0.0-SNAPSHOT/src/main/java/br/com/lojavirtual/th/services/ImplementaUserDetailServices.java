package br.com.lojavirtual.th.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.lojavirtual.th.model.Usuario;
import br.com.lojavirtual.th.repository.UsuarioRepository;

@Service
public class ImplementaUserDetailServices implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		/* recebe login pra consulta */
		Usuario usuario = usuarioRepository.findUserByLogin(username);
		if (usuario == null) {
			throw new UsernameNotFoundException("Usuario Não foi encontrado");
		}

		return new User(usuario.getLogin(), usuario.getSenha(), usuario.getAuthorities());
	}

}
