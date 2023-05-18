package views;

import java.util.ArrayList;

import controller.DulceriaController;
import models.Dulce;

public interface View {
    
    public void iniciar(DulceriaController controller);
    
    public Dulce agregarDulce();
    public void eliminarDulce(int index,ArrayList <Dulce> dulces);
    public void listadoDeDulces(ArrayList<Dulce> dulces);
    public void buscarDulcePorNombre(String nombreDulce, ArrayList<Dulce> dulce);
    public void actualizarDulce(Dulce dulce,int index);
    

    
}
