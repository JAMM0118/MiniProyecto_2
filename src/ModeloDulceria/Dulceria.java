package ModeloDulceria;

import java.util.ArrayList;

public class Dulceria {
    String nombre, categoria;
    ArrayList <Dulceria> dulces;

    public Dulceria(String nombre_,String categoria_){
        this.nombre = nombre_;
        this.categoria = categoria_;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCategoria(){
        return categoria;
    }
    
    public void agregarDulce(Dulceria dulce){
        this.dulces.add(dulce);
    }

    public void eliminarDulce(Dulceria dulce){
        this.dulces.remove(dulce);
    }

    public ArrayList <Dulceria> listarDulces(){
        return dulces;
    }

    public void actualizarDulce(int index, Dulceria dulce){
        this.dulces.set(index, dulce);
    }
    
    public Dulceria buscarDulcePorNombre(String nombre_){
        for (Dulceria dulce :  this.dulces){
            if (dulce.getNombre().toLowerCase().equals(nombre_.toLowerCase())) {
                return dulce;
            }
        }
        return null;
    }
}
