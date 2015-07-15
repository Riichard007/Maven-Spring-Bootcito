package org.amil.maven;

import java.io.*;

public class LeerArchivo implements Leer{
    
    @Override
    public String leer() throws Exception {
        File file = new File("/home/amil/Documentos/archivito");
        FileInputStream fis = new FileInputStream(file);
        StringBuilder sb = new StringBuilder();
        int ch = 0;
        while((ch = fis.read()) != -1){
            sb.append((char)ch);
        }
        return sb.toString();
    }    
}