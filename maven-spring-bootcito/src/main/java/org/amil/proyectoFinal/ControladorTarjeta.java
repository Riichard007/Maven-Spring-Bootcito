package org.amil.proyectoFinal;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Amil
 */
@Controller
@RequestMapping("/")
public class ControladorTarjeta {

    @RequestMapping(value = "/tarjeta/{nombre}/{fechaCorte}", method = RequestMethod.POST, headers = {"Accept=text/html"})
    @ResponseBody String guardarTarjeta(@PathVariable String nombre, @PathVariable Integer fechaCorte) throws Exception {
        Tarjeta t = new Tarjeta();
        t.setDiaCorte(fechaCorte);
        t.setNombre(nombre);
        DAOTarjeta dao = new DAOTarjeta();
        dao.guardar(t);

        return "Tarjeta guardada con éxito";
    }

    @RequestMapping(value = "/tarjeta", method = RequestMethod.GET, headers = {"Accept=application/json"})
    @ResponseBody ArrayList<Tarjeta> obtenerTodo() throws Exception {
        DAOTarjeta dao = new DAOTarjeta();
        ArrayList<Tarjeta> tarjetas = dao.buscarTodos();
        return tarjetas;
    }
}