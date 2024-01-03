package com.security.springsecurity.configuration;

import com.security.springsecurity.model.User;
import com.security.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import java.util.Optional;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserRepository userRepository;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService()).passwordEncoder(NoOpPasswordEncoder.getInstance());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/product/**").hasAnyRole("role_admin")
                .anyRequest().fullyAuthenticated()
                .and().httpBasic();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return username -> {
            Optional<User> userOptional = userRepository.findByName(username);
            return userOptional.map(user -> org.springframework.security.core.userdetails.User
                            .withUsername(user.getName())
                            .password(user.getPassword())
                            .roles(user.getRole())
                            .build())
                    .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
        };
    }
}
