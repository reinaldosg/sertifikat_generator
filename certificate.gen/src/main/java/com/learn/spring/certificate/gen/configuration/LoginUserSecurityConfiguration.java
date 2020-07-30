package com.learn.spring.certificate.gen.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class LoginUserSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);

    }

    // Autorisasi laman-laman yang bisa diakses (secara manual)
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/", "/welcome-page", "/css/**", "/js/**")
                    .permitAll()
                .antMatchers("/edit-page")
                    .hasAnyRole("MEMBER", "ADMIN")
                    .anyRequest()
                    .authenticated()
                .and().formLogin().loginPage("/login-user")
                    .loginProcessingUrl("/login-user")
                    .defaultSuccessUrl("/welcome-page")
                    .permitAll()
                .and().logout()
                    .permitAll();

        http.csrf().disable();
    }

    // Add default user untuk sementara cek login dkk nya
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder managerBuilder) throws Exception {
        managerBuilder.inMemoryAuthentication()
                .withUser("admin")
                    .password("{noop}admin")
                    .authorities("ADMIN")
                .and()
                .withUser("test1")
                    .password("{noop}123")
                    .authorities("MEMBER");
    }
}
