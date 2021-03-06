package model;

/**
 * Documents
 * model
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 24-06-22
 */
public class DocumentoPDF extends Documento {

    private boolean protegido;

    public boolean isProtegido() {
        return protegido;
    }

    public void setProtegido(boolean protegido) {
        this.protegido = protegido;
    }

    public DocumentoPDF(String titulo, boolean protegido) {
        super(titulo);
        this.protegido = protegido;
    }

    @Override
    public boolean validar() {
        System.out.println("El documento PDF con titulo " + getTitulo() + " ha sido validado");
        return true;
    }

    @Override
    public boolean eliminar() {
        System.out.println("El documento PDF con titulo " + getTitulo() + " ha sido eliminado");
        return true;
    }
}
