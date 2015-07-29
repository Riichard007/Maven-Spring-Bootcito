package org.amil.maven;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class DAOProducto {

    private SessionFactory fac;
    private Session ses;
    private Transaction tranza;

    //Tendríamos que crear algo parecido a lo del parcial pasado
    public void guardar(Producto g) throws Exception {
        ses.save(g);
        cerrarSesion();
    }

    public DAOProducto() {
        fac = HibernateUtilidades.getSessionFactory();
        ses = fac.openSession();
        tranza = ses.beginTransaction();
    }
    
    public void cerrarSesion(){
        tranza.commit();
        ses.close();
    }
    
    public ArrayList <Producto> buscarTodos() throws Exception{
        Criteria cri = ses.createCriteria (Producto.class);
        ArrayList <Producto> gastos = (ArrayList <Producto>) cri.list();
        cerrarSesion();
        return gastos;
    }
    
    public Producto buscarPorId (Integer id) throws Exception{
        Criteria cri = ses.createCriteria(Producto.class);
        Producto gastos = (Producto) cri.add(Restrictions.idEq(id)).uniqueResult();
        cerrarSesion();
        return gastos;
    }
    
    public void actualizar (Producto g) throws Exception{
        ses.update(g);
        cerrarSesion();
    }
    
}
