package models;

public class Dulce {
    public Dulce(String nombre, int precio, String descripcion, Categorias categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }
    private String nombre;
    private Categorias categoria;


    public Categorias getCategoria() {
        return categoria;
    }
    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
