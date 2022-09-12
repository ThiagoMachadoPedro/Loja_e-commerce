package br.com.lojavirtual.th.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.lojavirtual.th.model.Usuario;

@Repository
@Transactional
public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{

	@Query(value ="select u from Usuario u where u.login = ?1")
	Usuario findUserByLogin(String Login);
	
	
	
}
