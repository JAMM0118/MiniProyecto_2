package views;

import java.util.ArrayList;
import java.util.Scanner;

import controller.DulceriaController;
import models.Categorias;
import models.Dulce;

public class ViewConsole implements View{
    String nombre;
    String descripcion;
    Categorias categoria;
    int precio,indice;
    Dulce prueba;
    DulceriaController controller;

    @Override
    public void iniciar(DulceriaController control){
        boolean continuar = true;
        Scanner read = new Scanner(System.in);
        this.controller = control;


        while(continuar){
            
            System.out.println("----WELCOME-----");
            System.out.println("----OPCIONES----");
            System.out.println("1. Insertar dulce");
            System.out.println("2. Actualizar dulce"); 
            System.out.println("3. Eliminar dulce"); 
            System.out.println("4. Buscar dulce por nombre");
            System.out.println("5. Listar todos los dulces");
            System.out.println("6. Salir");
            System.out.print("\n");
            System.out.print("Seleccion una opcion: ");
            int eleccion = read.nextInt();

            switch(eleccion){
                    
                case 1:
                read.nextLine();
                
                    System.out.print("Digite el nombre del dulce: ");
                    nombre = read.nextLine();
                    
                    System.out.print("Digite la descripcion del dulce: ");
                    descripcion = read.nextLine();
                    
                    System.out.print("Digite el precio del dulce: ");
                    precio = read.nextInt();
                    
                    read.nextLine();
                    
                    System.out.print("Digite la categoria del dulce (Dulce, Sin Azucar, Acido): ");
                    String category = read.nextLine();
                    categoria = Categorias.valueOf(category.toUpperCase());
                    
                    prueba = new Dulce(nombre, precio, descripcion, categoria);
                    control.insertar(prueba); break;

                case 2: control.listar();
                        read.nextLine();
                        System.out.print("\nSelecione el numero en lista del dulce a modificar: ");
                        indice = read.nextInt();
                        System.out.println("\n¿Que desea modificar?\n");
                        System.out.println("\n1. Modificar nombre");
                        System.out.println("2. Modificar categoria");
                        System.out.println("3. Modificar descripcion");
                        System.out.println("4. Modificar precio"); 
                        System.out.print("\n Seleccion una opcion: "); 
                        int decision = read.nextInt();
                        switch(decision){
                            case 1: 
                                read.nextLine();
                                System.out.print("Digite el nuevo nombre: ");
                                nombre = read.nextLine();
                                


                            case 2:
                            case 3:
                            case 4:
                        }
                        

                    break;

                case 3: 
                    read.nextLine();
                    control.listar();
                    System.out.print("\nDigite el numero en lista del dulce a eliminar: ");
                    indice = read.nextInt();
                    control.eliminar(indice); break;

                case 4: 
                    read.nextLine();
                    System.out.print("Digite el nombre del dulce a buscar: ");
                    String name = read.nextLine(); 
                    control.buscarPorNombre(name);break;

                case 5:control.listar(); break;
                    
                case 6: System.exit(0);
            }
            

        }
        control.actionPerformed(null);
        read.close();
    }

    @Override
    public Dulce agregarDulce() {
        return prueba;
    }
    @Override
    public void eliminarDulce(int index,ArrayList <Dulce> dulces) {
        dulces.remove(index); 
    }
    @Override
    public void listadoDeDulces(ArrayList <Dulce> dulces) {
        int i=1;
        for(Dulce dulce : dulces){
            System.out.print(i+". " + dulce + " ");
            i++;
        }
    }
    @Override
    public void buscarDulcePorNombre(String nombreDulce, ArrayList<Dulce> dulces) {
        for(Dulce dulce : dulces){
            if (dulce.getNombre().toLowerCase().equals(nombreDulce.toLowerCase())) {
                System.out.println(dulce+"");
            }
        }
    }
    @Override
    public void actualizarDulce( Dulce dulce,int index) {
        //dulceria.set(index,dulce);
    }

    
    
}
