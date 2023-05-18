import controller.DulceriaController;
import models.Dulceria;
import views.DulceriaGUI;
import views.DulceriaView;

public class App {
    public static void main(String[] args) throws Exception {
        DulceriaController controller = new DulceriaController();
        Dulceria dulceria = new Dulceria();
        DulceriaView view = new DulceriaGUI();
        controller.init(view, dulceria);
    }
}
