package com.footballSoccer.gate.interceptors;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
 
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
 
   
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(new LoggingInterceptor());
	}
	 
}

