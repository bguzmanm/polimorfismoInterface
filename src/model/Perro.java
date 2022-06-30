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
    public boolean validar() {
        System.out.println("El perrito fue validado!");
        return true;
    }


    @Override
    public boolean eliminar() {
        System.out.println("Perro malo!");
        return true;
    }
}
