package br.com.lojavirtual.th;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class aplicationContextLoad implements ApplicationContextAware {

	@Autowired
	private static ApplicationContext applicationContxt;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		this.applicationContxt =applicationContext;
	}

	public static ApplicationContext getApplicationContxt() {
		return applicationContxt;
	}


	
	
}
