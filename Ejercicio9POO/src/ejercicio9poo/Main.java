/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9poo;

/**
 *
 * @author Pues4Aula4
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cine cine1= new Cine(new Pelicula("Deadpool2",120,16,"NPI"),9.80);
        for (int i = 0; i < 45; i++) {
            Espectador persona = new Espectador();
            cine1.sentarEspectador(persona);
        }
        cine1.imprimirAsientos();
    }
    
}
