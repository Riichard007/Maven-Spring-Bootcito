package org.amil.maven;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class ControladorLeer {
    
    @RequestMapping(value="/leer", method = RequestMethod.GET, headers={"Accept=text/html"})
    @ResponseBody String leer() throws Exception{
        
        return "Aquí vamos a mostrar el servicio leer que ya hicimos";
        
    }
    
}