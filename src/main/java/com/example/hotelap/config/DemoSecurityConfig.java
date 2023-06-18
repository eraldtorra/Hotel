package com.example.hotelap.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;



@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        // add our users for in memory authentication

        User.UserBuilder users = User.withDefaultPasswordEncoder();

        auth.inMemoryAuthentication()
                .withUser(users.username("albi").password("test123").roles("MANAGER"))
                .withUser(users.username("erald").password("test123").roles("ADMIN"));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

            http.authorizeRequests()
                    .antMatchers("/home").permitAll()
                    .antMatchers("/leaders/**").hasRole("MANAGER")
                    .antMatchers("/systems/**").hasRole("ADMIN")
                    .and()
                    .formLogin()
                    .loginPage("/showMyLoginPage")
                    .loginProcessingUrl("/authenticateTheUser")
                    .defaultSuccessUrl("/home")
                    .permitAll()
                    .and()
                    .logout().permitAll()
                    .and()
                    .exceptionHandling().accessDeniedPage("/access-denied");
    }

}
