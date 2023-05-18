package views;

import java.util.ArrayList;

import controller.DulceriaController;
import models.Dulce;

public interface View {
    
    public void iniciar(DulceriaController controller);
    
    //public String getNombre();
    //public String getDescripcion();
    //public int getPrecio();
    //public Categorias getCategoria();
    public Dulce agregarDulce();
    //public void setNuevoDulce(Dulce dulce);
    public void eliminarDulce(int index,ArrayList <Dulce> dulces);
    public void listadoDeDulces(ArrayList<Dulce> dulces);
    public void buscarDulcePorNombre(String nombreDulce, ArrayList<Dulce> dulce);
    public void actualizarDulce(Dulce dulce,int index);
    

    
}
