/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18poo;

/**
 *
 * @author Alumno
 */
public class Opcion {
    
    private String textoOpcion;
    private boolean correcto;

    public Opcion(String textoOpcion, boolean correcto) {
        this.textoOpcion = textoOpcion;
        this.correcto = correcto;
    }

    
    public String getTextoOpcion() {
        return textoOpcion;
    }

    public void setTextoOpcion(String textoOpcion) {
        this.textoOpcion = textoOpcion;
    }

    public boolean isCorrecto() {
        return correcto;
    }

    public void setCorrecto(boolean correcto) {
        this.correcto = correcto;
    }

    @Override
    public String toString() {
        return "Opcion{" + "textoOpcion=" + textoOpcion + ", correcto=" + correcto + '}';
    }
    
    
}
