package Controller;

import java.util.ArrayList;

import Interfaz.InterfazConsole;
import ModeloDulceria.Dulceria;

public class Controller{
    private InterfazConsole leer = new InterfazConsole();
    private ArrayList <Dulceria> dulces = new ArrayList<>();
    private Dulceria prueba;


    public void init(){
        insertarDulce();
    }

    public void insertarDulce(){
        String nombre = leer.leerNombreDulce(); 
        String categoria = leer.leerCategoriaDulce();
        prueba = new Dulceria(nombre, categoria);
        dulces.add(0, prueba);
        

    }
    
}
