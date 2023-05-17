package ModeloDulceria;

public class Dulceria {
    
    String nombreDulce, categoriaDulce;
    
    public Dulceria(String nombre, String categoria){
        this.nombreDulce = nombre;       
        this.categoriaDulce = categoria;
    }

    public String getNombreDulce(){
        return nombreDulce;
    }

    public String getCategoriaDulce(){
        return categoriaDulce;
    }
    /* 
    public void agregarDulce(Dulceria dulce){
        dulces.add(dulce);
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
            if (dulce.getNombreDulce().toLowerCase().equals(nombre_.toLowerCase())) {
                return dulce;
            }
        }
        return null;
    }*/
}
