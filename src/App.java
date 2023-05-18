

import controller.DulceriaController;
import models.Dulceria;
import views.ViewConsole;
import views.View;
import views.com.interfaz.interfaz;

public class App {
    public static void main(String[] args) throws Exception {
        Dulceria dulceria = new Dulceria();
        View vista = new interfaz();
        DulceriaController control = new DulceriaController(dulceria, vista);
        control.inicializacion();
    }
}
