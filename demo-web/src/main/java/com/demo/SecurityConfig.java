package com.demo;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        //admin 请求的需要ADMIN角色
        //其他的 只要身份验证通过就可以
        http.authorizeRequests().
                 mvcMatchers("/other/**").permitAll().
                 mvcMatchers("/admin/**").hasRole("ADMIN").
                 mvcMatchers("/user/**").hasRole("USER")
                .anyRequest().authenticated()
                .and()
                .formLogin().and()
                .httpBasic();


    }
}
