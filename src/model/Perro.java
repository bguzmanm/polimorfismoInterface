package model;

/**
 * Documents
 * model
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 24-06-22
 */
public class Perro implements IValidacion, IEliminacion {

    private int cantidadPatas;

    public Perro(int cantidadPatas) {
        this.cantidadPatas = cantidadPatas;
    }

    public int getCantidadPatas() {
        return cantidadPatas;
    }

    public void setCantidadPatas(int cantidadPatas) {
        this.cantidadPatas = cantidadPatas;
    }

    @Override
    public void validar() {
        System.out.println("El perrito fue validado!");
    }


    @Override
    public void eliminar() {
        System.out.println("Perro malo!");
    }
}
