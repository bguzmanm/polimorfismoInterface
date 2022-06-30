package model;

/**
 * Documents
 * model
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 24-06-22
 */
public class DocumentoWord extends Documento {

    private String version;

    public DocumentoWord(String titulo, String version) {
        super(titulo);
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean validar() {
        System.out.println("El documento Word con titulo " + getTitulo() + " ha sido validado.");
        return true;
    }

    @Override
    public boolean eliminar() {
        System.out.println("El documento Word con titulo " + getTitulo() + " ha sido eliminado.");
        return true;
    }
}
