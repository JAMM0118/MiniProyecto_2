package views;

import controller.DulceriaController;
import models.Dulce;

public interface DulceriaView {

    public void init(DulceriaController controller);
    public void actualizarDulce();
    public Dulce buscarDulcePorNombre(String nombreDulce);
    public Dulce getDulce();
    public void actualizarVista();

}
