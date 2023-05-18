
import controller.DulceriaController;
import models.Dulceria;
import views.View;
import views.com.interfaz.interfaz;

public class App {
    public static void main(String[] args) throws Exception {
        View vista = new interfaz();
        Dulceria dulceria = new Dulceria();
        DulceriaController control = new DulceriaController(dulceria, vista);
        control.inicializacion();
    }
}
