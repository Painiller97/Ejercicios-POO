/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7poo;

/**
 *
 * @author Pues4Aula4
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Raices ecuacion = new Raices(12, 0, 8);
        if(ecuacion.getDiscriminante()>=0){
            ecuacion.obtenerRaices();
        }else{
            ecuacion.obtenerRaiz();
        }
        
        
    }
    
}
