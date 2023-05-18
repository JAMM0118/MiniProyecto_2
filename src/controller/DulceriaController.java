package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.View;
import models.Categorias;
import models.Dulce;
import models.Dulceria;

public class DulceriaController implements ActionListener{
    Categorias categoria;
    String nombre;
    int index;
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
        dulceria.buscarDulcePorNombre(nombre);
    }

    public void eliminar(int index){
        vista.eliminarDulce(index,dulceria.listadoDeDulces());
        dulceria.eliminarDulce(index);
    }

    public void actualizar(int index){
        vista.actualizarDulce(dulce, index);
        dulceria.actualizarDulce(dulce, index);
    }
    
    public void actionPerformed(ActionEvent e){
        insertar(dulce);
        listar();
        buscarPorNombre(nombre);
        eliminar(index);
        actualizar(index);   
    }
    
    
}
