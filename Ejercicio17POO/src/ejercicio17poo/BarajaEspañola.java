/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17poo;

import java.util.Stack;

/**
 *
 * @author Alumno
 */
public class BarajaEspañola extends Baraja {

    private boolean jugar;

    public BarajaEspañola(boolean jugar) {
        this.jugar = jugar;
    }

    public boolean isJugar() {
        return jugar;
    }

    public void setJugar(boolean jugar) {
        this.jugar = jugar;
    }

    public Stack<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(Stack<Carta> cartas) {
        this.cartas = cartas;
    }

    public Stack<Carta> getCartasfuera() {
        return cartasfuera;
    }

    public void setCartasfuera(Stack<Carta> cartasfuera) {
        this.cartasfuera = cartasfuera;
    }
    

   
    public void crearBaraja() {
        int numero;
        String palo;
        for (int i = 0; i < 4; i++) {
            if (jugar == false) {
                for (int j = 0; j < 10; j++) {
                    palo = Carta.PALOSESPAÑOLA[MetodosSueltos.generarNumero(0, 3)];
                    numero = Carta.NUMEROS[MetodosSueltos.generarNumero(0, 9)];
                    Carta a = new Carta(numero, palo);
                    this.cartas.push(a);
                }
            } else {
                for (int j = 0; j < 12; j++) {
                    palo = Carta.PALOSESPAÑOLA[MetodosSueltos.generarNumero(0, 3)];
                    numero = Carta.NUMEROSJUGAR[MetodosSueltos.generarNumero(0, 11)];
                    Carta a = new Carta(numero, palo);
                    this.cartas.push(a);
                }

            }
        }
    }
}
