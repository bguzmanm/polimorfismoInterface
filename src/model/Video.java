package model;

/**
 * Documents
 * model
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 24-06-22
 */
public class Video implements IValidacion, IEliminacion {

    @Override
    public void validar(){
        System.out.println("El video fue validado!");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminado el video malo!");
    }
}
