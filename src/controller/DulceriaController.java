package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

    public void insertar(){
        dulce = vista.getDulce();
        dulce.setId(dulceria.listadoDeDulces().size());
        dulceria.insertarNuevoDulce(dulce);  
    }

    public void listar(){
        vista.listadoDeDulces(dulceria.listadoDeDulces());
    }

    public Dulce buscarPorNombre(String nombre){
        return dulceria.buscarDulcePorNombre(nombre);
    }

    public void eliminar(int index){
        dulceria.eliminarDulce(index);
    }


    public String[] listadoDulces(){
        String[] dulcesStrings = new String[dulceria.listadoDeDulces().size()];
        ArrayList<Dulce> dulces = dulceria.listadoDeDulces();
        for (int i = 0; i < dulcesStrings.length; i++) {
            dulcesStrings[i] = dulces.get(i).toString();
        }

        return dulcesStrings;
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
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
}
