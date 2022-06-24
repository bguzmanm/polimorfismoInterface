package model;

/**
 * Documents
 * model
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 24-06-22
 */
public class Foto implements IValidacion, IEliminacion {
    @Override
    public void validar() {
        System.out.println("Estamos validando la foto... foto validada");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminada la pinche foto mala");
    }
}
