package org.amil.proyectoFinal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Amil
 */
public class DAOProducto {
    
    //Tendriamos que crear algo parecido a lo del parcial
    public static void guardar(Producto p)throws Exception{
    SessionFactory fac=    HibernateUtilidades.getSessionFactory();
      Session ses= fac.openSession();
      Transaction tranza= ses.beginTransaction();
      //Guardamos
      ses.save(p);
      ses.close();
    }
    
}
