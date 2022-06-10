package com.project.grocerystore;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.firewall.HttpFirewall;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@EnableWebSecurity
public class SecurityEnabler extends WebSecurityConfigurerAdapter {

	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().withUser("user").password("user").roles("USER")
		.and().withUser("Kannan").password("Kannan").roles("ADMIN")
		.and().withUser("Anandhu").password("kat").roles("USER");
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
		
	}
	
	protected void configure(HttpSecurity http)throws Exception {
	
		http.authorizeRequests().antMatchers("/admin").hasRole("ADMIN").and()
		.authorizeRequests().antMatchers("/customer").hasAnyRole("USER","ADMIN").and()
		.formLogin();
	}

}
