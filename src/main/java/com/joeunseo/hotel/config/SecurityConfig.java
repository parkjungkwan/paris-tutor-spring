//package com.joeunseo.hotel.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
////import org.springframework.security.authentication.AuthenticationManager;
////import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
////import org.springframework.security.config.annotation.web.builders.HttpSecurity;
////import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
////import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
////import org.springframework.security.web.SecurityFilterChain;
////import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
////import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//
//@Configuration
////@EnableWebSecurity
//public class SecurityConfig {
////    @Bean
////    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
////        return authenticationConfiguration.getAuthenticationManager();
////    }
////    @Bean
////    public BCryptPasswordEncoder encoder() {
////        return new BCryptPasswordEncoder();
////    }
//
////    @Bean
////    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity, UserDetailsServiceImpl userDetailsService) throws Exception {
////        httpSecurity
////                .csrf(AbstractHttpConfigurer::disable)
////                .authorizeHttpRequests((authorize) ->
////                        authorize
////                                .requestMatchers("/user/**", "/login","/hotel/**","/admin/**","/user/register/*", "/reply/**").permitAll()
////                                .anyRequest().authenticated())
////                .formLogin((form) ->
////                        form
////                                .loginPage("/login")
////                                .loginProcessingUrl("/user/auth")
////                                .successForwardUrl("/user/authSuccess")
////                                .failureForwardUrl("/user/authFail"))
////                .logout((logout) ->
////                        logout
////                                .logoutUrl("/user/logOut")
////                                .logoutSuccessUrl("/user/logOutSuccess")
////                                .clearAuthentication(true)
////                                .deleteCookies("JSESSIONID"))
////                .userDetailsService(userDetailsService);
////
////        httpSecurity.addFilterBefore(corsFilter(), UsernamePasswordAuthenticationFilter.class);
////
////        return httpSecurity.build();
////    }
////    @Bean
////    public CorsFilter corsFilter() {
////        CorsConfiguration configuration = new CorsConfiguration();
////        configuration.setAllowCredentials(true);
////        configuration.addAllowedOrigin("http://localhost:3000");
////        configuration.addAllowedHeader("*");
////        configuration.addAllowedMethod("*");
////
////        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
////        source.registerCorsConfiguration("/**", configuration);
////
////        return new CorsFilter(source);
////    }
//}
