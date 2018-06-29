/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12poo;

import java.util.ArrayList;


/**
 *
 * @author Daniel
 */
public class Juego {
     private Jugador[] jugadores;
     private Revolver revolver;

    public Juego(Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }
    
    public boolean finJuego(){
        if (revolver.disparar() == true){
            return true;
        }
        else{
            return false;
        }
    }
     public void ronda(Jugador j){
        j = new Jugador(1);
        j.disparar(revolver);
        if (j.isVivo()){
            revolver.siguienteBala();
        }
        else{
            finJuego();
        }
     }
}
