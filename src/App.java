import controller.DulceriaController;
import models.Dulceria;
import views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Dulceria dulceria = new Dulceria();
        ViewConsole vista = new ViewConsole();
        DulceriaController control = new DulceriaController(dulceria, vista);
        control.inicializacion();
    }
}
