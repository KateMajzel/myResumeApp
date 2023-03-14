package com.example.myresume.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import java.util.Arrays;

@Configuration
@EnableWebSecurity
public class Auth {

    @Bean
    protected PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
     public InMemoryUserDetailsManager get(){
        UserDetails user = User.withUsername("user")
                .password(passwordEncoder().encode("user"))
                .roles("USER")
                .build();
        UserDetails admin = User.withUsername("admin")
                .password(passwordEncoder().encode("admin"))
                .roles("ADMIN")
                .build();
        return new InMemoryUserDetailsManager(Arrays.asList(user, admin));
    }
    @Bean
    public SecurityFilterChain filterChain (HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/**", "/workExperiences/**", "/educations/**", "/thanks/**", "/hub/**", "/contact/**", "/resource/**")
                .permitAll()

                .antMatchers( "/","/editWorkExperience/**", "/editEducation/**")
                .hasAnyRole("ADMIN")

                .antMatchers(HttpMethod.POST, "/", "/editWorkExperience/**", "/editEducation/**").hasRole("ADMIN")
                .anyRequest()
                .authenticated()

                .and()
                .csrf().disable()
                .headers().frameOptions().disable()

                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()

                .and()
                .logout()
                .logoutUrl("/logout")
                .permitAll();

                return http.build();

    }
}
