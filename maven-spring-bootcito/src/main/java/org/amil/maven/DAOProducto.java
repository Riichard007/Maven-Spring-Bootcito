package org.amil.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DAOProducto {
    
    //Tendríamos que crear algo parecido a lo del parcial pasado
    public static void guardar(Producto p) throws Exception {
        SessionFactory fac = HibernateUtilidades.getSessionFactory();
        Session ses = fac.openSession();
        Transaction tranza= ses.beginTransaction();
        
        //Ahora si guardamos
        ses.save(p);
        ses.close();
    }
}
