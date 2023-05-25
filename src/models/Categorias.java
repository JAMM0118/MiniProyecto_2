
package models;

public enum Categorias {
    DULCE, ACIDO, SINAZUCAR;
    
    public String mostrarNombre() {   
        if (this == SINAZUCAR) {
            return "SIN AZUCAR";
        }else {
            return this.name();
        }
    }
}