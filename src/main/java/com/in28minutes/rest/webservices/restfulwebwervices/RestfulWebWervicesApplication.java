package com.in28minutes.rest.webservices.restfulwebwervices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import java.util.Locale;

@SpringBootApplication
public class RestfulWebWervicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestfulWebWervicesApplication.class, args);
    }

    @Bean
    public LocaleResolver localeResolver(){
        AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
        localeResolver.setDefaultLocale(Locale.US);
        return localeResolver;
    }
    

}
