package org.amil.maven;

public class LeerMySQL implements Leer {

    @Override
    public String leer() throws Exception {
        //Aquí va todo lo de Hibernate
        String mensajito = "Conectado a MySQL";
        return mensajito;
    }

}