package br.com.lojavirtual.th.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lojavirtual.th.model.Acesso;
import br.com.lojavirtual.th.repository.AcessoRepository;

@Service
public class AcessoServices {
	
	@Autowired
	private AcessoRepository acessoRepository;
	

	
	public Acesso save(Acesso acesso) {
		
		acesso.setDescricao("ROLE_ADMIN");
		
		
		return acessoRepository.save(acesso); 
		
	}
	
	
	

}
