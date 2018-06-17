/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10poo;

/**
 *
 * @author Daniel
 */
public class Baraja {

    public static final int CARTAS = 40;

    private Carta carta[];
    private int cartaSiguiente;

    public Baraja() {
        this.carta = new Carta[CARTAS];
        this.cartaSiguiente = 0;
    }

    private void crearBaraja() {

        String[] palos = Carta.PALOS;

        for (int i = 0; i < palos.length; i++) {

            for (int j = 0; j < 12; j++) {

                if (!(j == 7 || j == 8)) {
                    if (j >= 9) {
                        carta[((i * (12 - 2)) + (j - 2))] = new Carta(j + 1, palos[i]);
                    } else {
                        carta[((i * (12 - 2)) + j)] = new Carta(j + 1, palos[i]);
                    }

                }
            }

        }

    }
    
    public void barajar() {
 
        int random = 0;
        Carta cart;
 
        //Recorro las cartas
        for (int i = 0; i < carta.length; i++) {
 
            random = MetodosSueltos.generarNumero(0, CARTAS - 1);
 
            cart = carta[i];
            carta[i] = carta[random];
            carta[random] = cart;
 
        }
 
 
    }
 

}
