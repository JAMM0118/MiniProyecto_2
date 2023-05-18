package models;

import java.util.ArrayList;

public class Dulceria {
    private ArrayList<Dulce> dulces;

    public Dulceria() {
        dulces = new ArrayList<Dulce>();
    }

    public ArrayList<Dulce> listadoDeDulces() {
        return  dulces;
    }

    public Dulce buscarDulcePorNombre(String nombreDulce) {
        for (Dulce dulce : dulces) {
            if (dulce.getNombre().toLowerCase().equals(nombreDulce.toLowerCase())) {
                return dulce;
            }
        }
        return null;
    }

    public boolean eliminarDulce(int indexDulce) {
        if ((indexDulce-1) > 0 && (indexDulce-1) <= dulces.size()) {
            return dulces.remove(indexDulce-1) != null;
        }
        return false;
    }

    public boolean insertarNuevoDulce(Dulce dulce) {
        return dulces.add(dulce);
    }

    public void actualizarDulce(Dulce dulce, int index){
        dulces.set(index, dulce);
    }
}
