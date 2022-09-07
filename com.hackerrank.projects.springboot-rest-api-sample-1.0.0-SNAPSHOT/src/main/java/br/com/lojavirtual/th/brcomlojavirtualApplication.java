package br.com.lojavirtual.th;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import br.com.lojavirtual.th.model.Acesso;
import br.com.lojavirtual.th.repository.AcessoRepository;

@SpringBootApplication
@EntityScan(basePackages ="br.com.**")
@ComponentScan(basePackages = "br.com.**")
@EnableJpaRepositories("br.com.**")
@EnableTransactionManagement // resolve a parte de transaçoes com banco de dados
public class brcomlojavirtualApplication {

	public static void main(String[] args) {
		SpringApplication.run(brcomlojavirtualApplication.class, args);
	}

	@Autowired
	private AcessoRepository acessoRepository;
	
public AcessoRepository save(Acesso acesso) {
		
		acesso.setDescricao("ROLE_ADMIN");
		
		
		return (AcessoRepository) acessoRepository.save(acesso); 
		
	}
	
	
	
	
	
	
	
	
}
