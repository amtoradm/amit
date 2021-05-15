package com.example.profiles.comfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DBConfiguration {
	
	private String driverClassName;
	private String url;
	private String username;
	private String password;
	
	@Profile("dev")
	@Bean
	public String devDatabaseConnection() {
		System.out.println("DB Connection for Dev");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB Connection for Dev";
	}
	
	@Profile("test")
	@Bean
	public String testDatabaseConnection() {
		System.out.println("DB Connection for Test");
		System.out.println("Driver Name = "+driverClassName);
		System.out.println("URL = "+url);
		return "DB Connection for Test";
	}
	
	@Profile("prod")
	@Bean
	public String prodDatabaseConnection() {
		System.out.println("DB Connection for Prod");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB Connection for Prod";
	}
	
	@Profile("stage")
	@Bean
	public String stageDatabaseConnection() {
		System.out.println("DB Connection for Stage");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB Connection for Stage";
	}
	
	@Profile("uat")
	@Bean
	public String uatDatabaseConnection() {
		System.out.println("DB Connection for UAT");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB Connection for UAT";
	}
	

}
