package br.edu.senaisp.colegio.config;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.LocaleResolver;

@Configuration
public class Internacionalizacao {
	
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messSource = 
				new ReloadableResourceBundleMessageSource();
		messSource.setBasename("classpath:message");
		messSource.setDefaultEncoding("ISO-8859-1");
		return messSource;
	}
	
	@Bean
	public LocaleResolver localeResolver() {
		AcceptHeaderLocaleResolver locResolver 
		   = new AcceptHeaderLocaleResolver();
		locResolver.setDefaultLocale(
				          new Locale("pt", "BR"));
		return locResolver;
	}
	

}
