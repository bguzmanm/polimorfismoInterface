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
    public boolean validar(){
        System.out.println("El video fue validado!");
        return true;
    }

    @Override
    public boolean eliminar() {
        System.out.println("Eliminado el video malo!"); return true;
    }
}
