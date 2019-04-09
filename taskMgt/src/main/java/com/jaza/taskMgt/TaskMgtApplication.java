package com.jaza.taskMgt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/**
 * @author dheeraj.yadav
 *
 */

@SpringBootApplication
public class TaskMgtApplication extends WebMvcConfigurerAdapter{

	public static void main(String[] args) {
		SpringApplication.run(TaskMgtApplication.class, args);
	}
	
	 @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")
	                .allowedMethods("POST, GET, OPTIONS, PATCH, DELETE, PUT");
	    }
}
