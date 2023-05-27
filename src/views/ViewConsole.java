package views;

import java.util.ArrayList;
import java.util.Scanner;
import controller.DulceriaController;
import models.Categorias;
import models.Dulce;

public class ViewConsole implements View{
    String nombre,precio,indice;
    String descripcion,decision;
    Categorias categoria;
    Dulce candy;
    DulceriaController controller;

   
    public void iniciar(DulceriaController control){
        boolean continuar = true;
        Scanner read = new Scanner(System.in);
        this.controller = control;

        while(continuar){
            System.out.print("\n");
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
            String eleccion = read.nextLine();
            try{
                switch(Integer.parseInt(eleccion)){
                    
                case 1:
                    System.out.print("Digite el nombre del dulce: ");
                    nombre = read.nextLine();
                    
                    System.out.print("Digite la descripcion del dulce: ");
                    descripcion = read.nextLine();
                    System.out.print("Digite la categoria del dulce (Dulce, Sin Azucar, Acido): ");
                    String category = read.nextLine();
                    if(category.toLowerCase().equals("sin azucar") || category.toLowerCase().equals("dulce") ||
                    category.toLowerCase().equals("acido") ){
                        if(category.toLowerCase().equals("sin azucar")){
                            category = "sinazucar";
                        }
                        categoria = Categorias.valueOf(category.toUpperCase());
                                    
                    }else{
                        System.out.println("Esta categoria no existe. vuelve a empezar");
                        System.out.println("\nPresione enter para continuar..... ");
                        read.nextLine();break;
                    }
                    System.out.print("Digite el precio del dulce: ");
                    precio = read.nextLine();
                    candy= new Dulce(nombre, Integer.parseInt(precio), descripcion, categoria);
                    control.insertar();
                    System.out.println("Dulce insertado correctamente");
                    System.out.println("\nPresione enter para continuar..... ");
                    read.nextLine();
                    break;

                case 2: 
                        control.listar();
                        do{
                        System.out.print("\nSelecione el numero en lista del dulce a modificar: ");
                        indice = read.nextLine();
                            if(Integer.parseInt(indice)>control.listadoDulces().length){
                                System.out.println("Este numero no esta en el rango de los dulces ingresados"); 
                            }
                        }while(Integer.parseInt(indice)>control.listadoDulces().length);

                        System.out.println("\n¿Que desea modificar?");
                        System.out.println("\n1. Modificar nombre");
                        System.out.println("2. Modificar categoria");
                        System.out.println("3. Modificar descripcion");
                        System.out.println("4. Modificar precio");
                            
                        System.out.print("Selecione una opcion: "); 
                        decision = read.nextLine();
                        
                        switch(Integer.parseInt(decision)){
                            case 1: 
                                System.out.print("Digite el nuevo nombre: ");
                                nombre = read.nextLine();
                                control.actualizar(Integer.parseInt(indice),nombre,null,0,null);
                                System.out.println("Nombre actualizado correctamente");
                                System.out.println("\nPresione enter para continuar..... ");
                                read.nextLine();
                                break;
                            case 2:
                                System.out.print("Digite la nueva categoria (Acido -Sin Azucar - Dulce): ");
                                String ayuda = read.nextLine();
                                if(ayuda.toLowerCase().equals("sin azucar") || ayuda.toLowerCase().equals("dulce") ||
                                ayuda.toLowerCase().equals("acido") ){
                                    if(ayuda.toLowerCase().equals("sin azucar")){
                                    ayuda = "sinazucar";
                                    }
                                    categoria = Categorias.valueOf(ayuda.toUpperCase());
                                    control.actualizar(Integer.parseInt(indice),null,null,0,categoria);
                                    System.out.println("Categoria actualizada correctamente");
                                    System.out.println("\nPresione enter para continuar..... ");
                                    read.nextLine();
                                    break;
                                }else{
                                    System.out.println("Esta categoria no existe. vuelve a empezar");
                                    System.out.println("\nPresione enter para continuar..... ");
                                    read.nextLine();break;
                                }
                                
                            case 3:
                                System.out.print("Digite la nueva descripcion: ");
                                descripcion = read.nextLine();
                                control.actualizar(Integer.parseInt(indice),null,descripcion,0,null);
                                System.out.println("Descripcion actualizada correctamente");
                                System.out.println("\nPresione enter para continuar..... ");
                            read.nextLine();
                                
                                break;
                            case 4:
                                System.out.print("Digite el nuevo precio: ");
                                precio = read.nextLine();
                                control.actualizar(Integer.parseInt(indice),null,null,Integer.parseInt(precio),null);
                                System.out.println("Precio actualizado correctamente");
                                System.out.println("\nPresione enter para continuar..... ");
                                read.nextLine();
                                break;
                            default:  System.out.println("Esta opcion no existe");
                            System.out.println("\nPresione enter para continuar..... ");
                            read.nextLine();break;
                        }
                    break;
                case 3: 
                    control.listar();
                    do{
                        System.out.print("\nDigite el numero en lista del dulce a eliminar: ");
                        indice = read.nextLine();
                        if(Integer.parseInt(indice)>control.listadoDulces().length){
                            System.out.println("Este numero no esta en el rango de los dulces ingresados"); 
                        }
                        }while(Integer.parseInt(indice)>control.listadoDulces().length);
                        System.out.println("Dulce eliminado correctamente");
                        System.out.println("\nPresione enter para continuar..... ");
                        read.nextLine();
                        control.eliminar((Integer.parseInt(indice))-1);break;

                case 4: 
                    System.out.print("Digite el nombre del dulce a buscar: ");
                    String name = read.nextLine();
                    if(control.buscarPorNombre(name) == null){
                        System.out.println("El dulce no ha sido encontrado");
                        System.out.println("\nPresione enter para continuar..... ");
                        read.nextLine();
                    }else{
                        System.out.println(control.buscarPorNombre(name));
                        System.out.println("\nPresione enter para continuar..... ");
                        read.nextLine();
                    } break;

                case 5:
                    if(control.listadoDulces().length > 0){
                        control.listar();
                        System.out.println("\nPresione enter para continuar..... ");
                        read.nextLine(); break;
                    }else{
                        System.out.println("No hay dulces en lista todavia");
                        System.out.println("\nPresione enter para continuar..... ");
                        read.nextLine();break;
                    }
                    
                case 6: System.exit(0);
                default: System.out.println("Esta opcion no existe. Elije una opcion valida");
                System.out.println("\nPresione enter para continuar..... ");
                read.nextLine();break;
                
            }
            }catch (NumberFormatException e) {
            System.out.println("La entrada esperaba un numero vuelva a realizar la accion");
            System.out.println("\nPresione enter para continuar..... ");
                read.nextLine();
            }
        }
        control.actionPerformed(null);
        read.close();
    }

    public Dulce agregarDulce(Dulce dulce) {
        return candy;
    }
    
    public void listadoDeDulces(ArrayList <Dulce> dulces) {
        System.out.print("\n -- Lista de dulces --"+"\n");
        int i=1;
        for(Dulce dulce : dulces){
            System.out.print(i+". " + dulce + " \n");
            i++;
        }
    }
    @Override
    public Dulce buscarDulcePorNombre(String nombreDulce, ArrayList<Dulce> dulces) {
        System.out.print("\nInformacion del dulce buscado"+"\n");
        for(Dulce dulce : dulces){
            if (dulce.getNombre().toLowerCase().equals(nombreDulce.toLowerCase())) {
                System.out.println(dulce+"");
                return dulce;
            }
        }
        return null;
    }

    public void actualizarDulce( Dulce dulce,int index) {}

    @Override
    public void setDulce(Dulce dulce) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDulce'");
    }

    @Override
    public void eliminarDulce(int index) {}

    @Override
    public Dulce getDulce() {
        return candy;
    }
}