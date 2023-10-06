package com.saurabh.springboot.myfirstwebapp.security;


import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SpringSecurityConfiguration {
	//LDAP or Database
	//In Memory
	
		@Bean
		 public InMemoryUserDetailsManager userDetailsService() {
		
			
			UserDetails user1 = createUser("sp", "ssss");
			UserDetails user2 = createUser("sp2", "ssss");
			 
			return new InMemoryUserDetailsManager(user1, user2);
			 
		 }

	private UserDetails createUser(String username, String password) {
		Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);
		
		UserDetails user = User.builder().passwordEncoder(passwordEncoder)
				.username(username)
				.password(password)
				.roles("USER","ADMIN").build();
		return user;
	}
		
		@Bean
		public PasswordEncoder passwordEncoder() {
			return new BCryptPasswordEncoder();
		}
		
		//so below steps are configured in filterchain, by default all urls are protected
		//All URLs are protected
		//A login form is shown for unauthorized requests
		//CSRF disable
		//Frames
		
		@Bean
		public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
			
			http.authorizeHttpRequests(
					auth -> auth.anyRequest().authenticated());
			http.formLogin(withDefaults());
			
			http.csrf().disable();
			http.headers().frameOptions().disable();
			
			return http.build();
		}
		  
	
}
