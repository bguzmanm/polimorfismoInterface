import model.DocumentoPDF;
import org.junit.Assert;
import org.junit.Test;
import service.ServicioValidacion;

/**
 * Documents
 * test
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 30-06-22
 */
public class TestValidacion {

    @Test
    public void addServicioValidacion(){

        DocumentoPDF doc1 = new DocumentoPDF("Poemas de odio", false);
        ServicioValidacion sv = new ServicioValidacion();
        sv.add(doc1);

        Assert.assertTrue(sv.getLista().size() == 1);
    }
    @Test
    public void validarServicioValidacion(){
        DocumentoPDF doc1 = new DocumentoPDF("Poemas de odio", false);
        ServicioValidacion sv = new ServicioValidacion();
        sv.add(doc1);

        Assert.assertTrue(sv.validar());

    }



}
