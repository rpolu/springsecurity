package com.spring.security.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/bankdetails").permitAll().
		antMatchers("/user").hasAnyRole("USER", "ADMIN").
		antMatchers("/all").hasAnyRole("ADMIN").and().formLogin();
	}

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("rama").password("{noop}rama").roles("USER").
		and().withUser("mohan").password("{noop}mohan").roles("ADMIN");
	}

}
