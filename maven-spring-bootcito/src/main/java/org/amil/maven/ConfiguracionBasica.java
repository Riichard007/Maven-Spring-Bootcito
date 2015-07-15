package org.amil.maven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracionBasica {
 
    @Bean
    Leer servicioLeer(){
        Leer la = new LeerArchivo();
        return la;
    }
        
}