package com.in28minutes.rest.webservices.restfulwebservices.basic;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

//@Configuration
public class BasicAuthenticationSecurityConfiguration {
	
	//Filter Chain
	//disable csrf to stop authentication for post requests
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		
		return http
				.authorizeHttpRequests(
				auth -> auth
				.requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()
//				.requestMatchers(PathRequest.toH2Console()).permitAll()
				.anyRequest().authenticated()
				)
				.httpBasic(Customizer.withDefaults())
				.sessionManagement(
						session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.csrf().disable()
				.build();
		
	}

}
