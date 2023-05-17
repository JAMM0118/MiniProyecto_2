package Interfaz;

import java.util.Scanner;

public class InterfazConsole {
    public Scanner read = new Scanner(System.in);
    String nombre,categoria;

    public String leerNombreDulce(){
        System.out.print("Digite el nombre del dulce: ");
        nombre = read.nextLine();

        return nombre;
    }
    
    public String leerCategoriaDulce(){
        
        System.out.print("Digite la categoria del dulce: ");
        categoria = read.nextLine();

        return categoria;
    }
    
    
}
