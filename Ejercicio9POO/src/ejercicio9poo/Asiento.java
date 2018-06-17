/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9poo;

/**
 *
 * @author Alumno
 */
public class Asiento {
    private String etiqueta;
    private boolean ocupado;

    public Asiento(String etiqueta, boolean ocupado) {
        this.etiqueta = etiqueta;
        this.ocupado = ocupado;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    public void sentar(){
     if (ocupado == false){
     } 
    }
}
