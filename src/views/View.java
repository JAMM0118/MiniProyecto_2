package views;

import java.util.ArrayList;

import controller.DulceriaController;
import models.Dulce;

public interface View {
    
    public void iniciar(DulceriaController controller);
    public Dulce getDulce();
    public void setDulce(Dulce dulce);
    
    public void eliminarDulce(int index);
    public void listadoDeDulces(ArrayList<Dulce> dulces);
    public Dulce buscarDulcePorNombre(String nombreDulce, ArrayList<Dulce> dulce);
    public void actualizarDulce(Dulce dulce,int index);    
}