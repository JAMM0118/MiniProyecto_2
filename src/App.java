
import controller.DulceriaController;
import models.Dulceria;
import views.View;
import views.ViewConsole;
import views.DulceriaGUI;

public class App {
    public static void main(String[] args) throws Exception {
        View vista = new ViewConsole();
        Dulceria dulceria = new Dulceria();
        DulceriaController control = new DulceriaController(dulceria, vista);
        control.inicializacion();
    }
}
