package com.example.Internatinalization;

import java.util.Locale;
import org.springframework.boot.autoconfigure.web.WebProperties.LocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class Internationalization extends WebMvcConfigurerAdapter {

	@Bean
	public SessionLocaleResolver localeResolver() {
	 SessionLocaleResolver resolver = new SessionLocaleResolver();
	 resolver.setDefaultLocale(Locale.US);
	 return resolver;
	 }
	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		
		LocaleChangeInterceptor lc=new LocaleChangeInterceptor();
		lc.setParamName("languages");
		
		return lc;	
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(localeChangeInterceptor());
	}
	
}
