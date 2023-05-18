package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.View;
import models.Categorias;
import models.Dulce;
import models.Dulceria;

public class DulceriaController implements ActionListener{
    Categorias categoria;
    String nombre,descripcion;
    int index,precio;
    Dulce dulce;
    Dulceria dulceria;
    View vista;
    
    public void inicializacion(){
        vista.iniciar(this);
    }

    public DulceriaController(Dulceria dulceria, View vista){
        this.dulceria = dulceria;
        this.vista = vista;
    }

    public void insertar(Dulce dulce){
        dulce = vista.agregarDulce(); 
        dulceria.insertarNuevoDulce(dulce);  
    }

    public void listar(){
        vista.listadoDeDulces(dulceria.listadoDeDulces());
    }

    public void buscarPorNombre(String nombre){
        vista.buscarDulcePorNombre(nombre,dulceria.listadoDeDulces());
        
    }

    public void eliminar(int index){
        vista.eliminarDulce(index-1,dulceria.listadoDeDulces());
    }

    public void actualizar(int index, String nombre, String descripcion, int precio, Categorias categoria){
        dulce = dulceria.listadoDeDulces().get(index-1);
        if(nombre != null){
            dulce.setNombre(nombre);    
        }
        if(categoria != null){
            dulce.setCategoria(categoria);
        }
        if(descripcion != null){
            dulce.setDescripcion(descripcion);
        }
        if(precio != 0){
            dulce.setPrecio(precio);
        }
        dulceria.actualizarDulce(dulce, index-1);
    }
    
    public void actionPerformed(ActionEvent e){
        insertar(dulce);
        listar();
        buscarPorNombre(nombre);
        eliminar(index);
        actualizar(index,nombre,descripcion,precio,categoria);   
    }
}