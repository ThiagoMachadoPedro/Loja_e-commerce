package br.com.lojavirtual.th.sercurity;

import javax.servlet.http.HttpSessionListener;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true) // para poder atuvar segurança e adc mais
																			// tarefas posteriores
public class WebConfigSecurity extends WebSecurityConfigurerAdapter implements HttpSessionListener{

	
@Override
public void configure(WebSecurity web) throws Exception {
	
	
	/**/
	web.ignoring().antMatchers(HttpMethod.GET,"/salvarAcesso").
	antMatchers(HttpMethod.POST, "/salvarAcesso");
	
}
	
	
	
	
	
	
}
