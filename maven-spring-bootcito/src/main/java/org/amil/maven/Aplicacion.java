package org.amil.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan

public class Aplicacion {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(Aplicacion.class, args);

        System.out.println("Un mensaje desde Spring Boot");

        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(ConfiguracionBasica.class);
        Leer servicioLeer = acac.getBean(Leer.class);
        System.out.println(servicioLeer.leer());
        
    }
}