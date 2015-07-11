package org.amil.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan

public class Aplicacion {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(Aplicacion.class, args);

        System.out.println("Un mensaje desde Spring Boot");
        
        LeerArchivo la = new LeerArchivo();
        System.out.println(la.leer());

    }
}