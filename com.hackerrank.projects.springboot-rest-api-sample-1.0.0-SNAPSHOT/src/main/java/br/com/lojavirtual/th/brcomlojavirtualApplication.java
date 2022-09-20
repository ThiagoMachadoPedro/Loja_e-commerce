package br.com.lojavirtual.th;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = "br.com.*")
@ComponentScan(basePackages = "br.com.*")
@EnableJpaRepositories("br.com.*")
@EnableTransactionManagement // resolve a parte de transaçoes com banco de dados
public class brcomlojavirtualApplication {

	public static void main(String[] args) {
		
		
		System.out.println(new BCryptPasswordEncoder().encode("123"));//
		
		
		
		
		SpringApplication.run(brcomlojavirtualApplication.class, args);
	}

}
