/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11poo;

/**
 *
 * @author Alumno
 */
public class Partido {
    private boolean victoria;

    public Partido() {
       int victoriaPartido = MetodosSueltos.generarNumero(0, 1);

        if (victoriaPartido == 0){ 
            victoria = true;
        } else {
            victoria = false;
        }
    }

    public boolean isVictoria() {
        return victoria;
    }

    public void setVictoria(boolean victoria) {
        this.victoria = victoria;
    }
    

    @Override
    public String toString() {
        return "Partido{" + "victoria=" + victoria + '}';
    }
    
    
}
