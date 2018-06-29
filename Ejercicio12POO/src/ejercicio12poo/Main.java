/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12poo;

/**
 *
 * @author Daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Revolver revolver = new Revolver();
        Juego juego = new Juego(revolver);
        Jugador j1 = new Jugador(1);
        Jugador j2 = new Jugador(2);
        Jugador j3 = new Jugador(3);
        Jugador j4 = new Jugador(4);
        Jugador j5 = new Jugador(5);
        Jugador j6 = new Jugador(6);
        
        while (!juego.finJuego()){
            juego.ronda(j1);
            juego.ronda(j2);
            juego.ronda(j3);
            juego.ronda(j4);
            juego.ronda(j5);
            juego.ronda(j6);
          
        }
              
    }
    
}
