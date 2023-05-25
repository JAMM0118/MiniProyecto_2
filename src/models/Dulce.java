
package models;

import java.util.EnumSet;
import java.util.Set;

public class Dulce {
    private String nombre,descripcion;
    private int precio;
    private Categorias categoria;
    
    private int id;
    public Dulce(String nombre, int precio, String descripcion, Categorias categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }
    
    public Categorias getCategoria(){
        return categoria;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getPrecio(){
        return precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + " -- Categoría: " + categoria.mostrarNombre() + " -- Precio: " + precio;
    }
}

