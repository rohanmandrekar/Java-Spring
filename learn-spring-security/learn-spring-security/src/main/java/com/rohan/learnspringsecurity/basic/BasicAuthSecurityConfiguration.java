package com.rohan.learnspringsecurity.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class BasicAuthSecurityConfiguration {
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests(auth -> {
			auth.anyRequest().authenticated();
		});
		http.sessionManagement(
				session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		http.httpBasic();
		http.csrf().disable();
		return http.build();
	
	}
	
	
	@Bean
	public UserDetailsService userDetailsService() {
		var user= User.withUsername("rohan")
		.password("{noop}pass")
		.roles("USER")
		.build();
		
		var admin= User.withUsername("admin")
				.password("{noop}pass")
				.roles("ADMIN")
				.build();
		
		
		
		return new InMemoryUserDetailsManager(user,admin);
	}
}
