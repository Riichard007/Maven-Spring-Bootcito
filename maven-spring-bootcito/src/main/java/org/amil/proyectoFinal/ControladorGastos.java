package org.amil.proyectoFinal;

import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Amil
 */
@RestController
@RequestMapping("/")
public class ControladorGastos {

    @RequestMapping(value = "/gastos", method = RequestMethod.GET, headers = {"Accept=application/json"})
    @ResponseBody
    ArrayList<Gastos> obtenerTodos() throws Exception {
        DAOGastos dao = new DAOGastos();
        return dao.buscarTodos();
    }

    @RequestMapping(value = "/gastos/{fecha}/{concepto}/{cantidad}/{idTarjeta}", method = RequestMethod.POST, headers = {"Accept=text/html"})

    @ResponseBody
    String guardarGastos(@PathVariable Date fecha, @PathVariable String concepto, @PathVariable Float cantidad, @PathVariable Integer idTarjeta) throws Exception {
        Gastos g = new Gastos();
        g.setFecha(fecha);
        g.setConcepto(concepto);
        g.setCantidad(cantidad);
        Tarjeta t = new Tarjeta(idTarjeta);
        g.setIdTarjeta(t);
        DAOGastos dao = new DAOGastos();
        dao.guardar(g);
        return "Gastos Guardados";

    }

}
