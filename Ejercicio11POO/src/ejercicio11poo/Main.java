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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador j1 = new Jugador();
        j1.ponerDinero();
        Jugador j2 = new Jugador();
        j2.ponerDinero();
        Jugador j3 = new Jugador();
        j3.ponerDinero();
        Jugador j4 = new Jugador();
        j4.ponerDinero();
        Jugador j5 = new Jugador();
        j5.ponerDinero();
        Jugador j6 = new Jugador();
        j6.ponerDinero();
        
        Partido partido = new Partido();
        j1.empezarPorra(partido);
        j2.empezarPorra(partido);
        j3.empezarPorra(partido);
        j4.empezarPorra(partido);
        j5.empezarPorra(partido);
        
        
    }
    
}
