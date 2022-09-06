package br.com.lojavirtual.th.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.lojavirtual.th.model.Acesso;
@Repository
@Transactional
public interface AcessoRepository extends JpaRepository<Acesso, Long>{

	
	
	
}
