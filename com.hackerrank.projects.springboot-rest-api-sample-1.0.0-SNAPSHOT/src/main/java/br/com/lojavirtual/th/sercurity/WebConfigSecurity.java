package br.com.lojavirtual.th.sercurity;

import javax.servlet.http.HttpSessionListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.com.lojavirtual.th.services.ImplementaUserDetailServices;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true) // para poder atuvar segurança e adc mais
																			// tarefas posteriores
public class WebConfigSecurity extends WebSecurityConfigurerAdapter implements HttpSessionListener {

	@Autowired
	private ImplementaUserDetailServices implementacaoUserDetailServices;

	
	
	
	// consultar usuario no spring security login e senha do repository
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.userDetailsService(implementacaoUserDetailServices).
															passwordEncoder(new BCryptPasswordEncoder());
		
	
	}

	
	
	
	
	@Override
	public void configure(WebSecurity web) throws Exception {

		/* libera os end point ingnora algumas ulr */
		web.ignoring().antMatchers(HttpMethod.GET, "/salvarAcesso").antMatchers(HttpMethod.POST, "/salvarAcesso",
				"/deletaAcesso");

	}

}
