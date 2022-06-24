package service;

import model.Documento;
import model.IValidacion;

import java.util.ArrayList;
import java.util.List;

/**
 * Documents
 * PACKAGE_NAME
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 24-06-22
 */
public class ServicioValidacion {

    private List<IValidacion> lista = new ArrayList<IValidacion>();

    public void add(IValidacion d){
        lista.add(d);
    }

    public void validar(){
        for (IValidacion v: lista ) {
            v.validar();
        }
    }
}
