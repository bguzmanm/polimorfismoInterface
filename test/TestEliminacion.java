import model.Perro;
import model.Video;
import org.junit.Assert;
import org.junit.Test;
import service.ServicioEliminacion;

/**
 * Documents
 * PACKAGE_NAME
 *
 * @author Brian Guzmán M.
 * @version 0.1
 * @since 30-06-22
 */
public class TestEliminacion {

    @Test
    public void testElimina(){
        Video v = new Video();
        Perro p = new Perro(3);

        ServicioEliminacion se = new ServicioEliminacion();

        se.add(v);
        se.add(p);

        Assert.assertTrue(se.del());
    }
}
