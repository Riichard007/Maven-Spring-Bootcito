package org.amil.proyectoFinal;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Amil
 */
@ComponentScan
@Controller
@EnableAutoConfiguration
public class Aplicacion {

    @RequestMapping("/")
    
    @ResponseBody
    String hola() {

        return "Hola mundo";
    }

    public static void main(String[] args)throws Exception{
        // TODO code application logic here
        SpringApplication.run(Aplicacion.class, args);
        //Paso 1 abrrir una sesssion factory
 SessionFactory fac = HibernateUtilidades.getSessionFactory();
  Session sesion= fac.openSession();
  Transaction tranza=sesion.beginTransaction();
  Tarjeta t=new Tarjeta();
          t.setDiaCorte(28);
          t.setNombre("BANAMEX");
        // sesion.save(t);
          
      Gastos g=new Gastos();
          g.setCantidad(300f);
          g.setConcepto("cena baile");
          g.setFecha(new Date()); 
          g.setIdTarjeta(new Tarjeta(1)); 
        // sesion.save(g);
          
          
         tranza.commit();
         sesion.close();
         System.out.println("Tarjeta guadada con exito");
 
          
    }

}
