package service;

import model.IEliminacion;

import java.util.ArrayList;
import java.util.List;

/**
 * Documents
 * model
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 24-06-22
 */
public class ServicioEliminacion {

    List<IEliminacion> lista = new ArrayList<IEliminacion>();

    public void add(IEliminacion e){
        lista.add(e);
    }

    public void del(){
        for (IEliminacion e: lista) {
            e.eliminar();
        }
    }

}
