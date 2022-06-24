import model.*;
import service.ServicioEliminacion;
import service.ServicioValidacion;

/**
 * $PROJECT_NAME
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since $DATE
 */
public class Main {
    public static void main(String[] args) {
        DocumentoPDF doc1 = new DocumentoPDF("Introspección de un joven rebelde", false);
        DocumentoWord doc2 = new DocumentoWord("Spring Boot vs Spring Framework", "1.0.4");

        Video v1 = new Video();
        ServicioValidacion sc = new ServicioValidacion();

        sc.add(doc1);
        sc.add(doc2);
        sc.add(v1);

        Perro p = new Perro(3);
        sc.add(p);

        Foto f = new Foto();
        sc.add(f);

        sc.validar();


        ServicioEliminacion se = new ServicioEliminacion();

        se.add(doc1);
        se.add(doc2);
        se.add(v1);
        se.add(p);
        se.add(f);

        se.del();


    }
}