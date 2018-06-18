/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10poo;

import java.util.Enumeration;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Baraja {

    public static final int CARTAS = 40;

    private Stack<Carta> cartas;

    public Baraja() {
        this.cartas = new Stack<Carta>();
    }

    public void crearBaraja() {
        int numero;
        String palo;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                palo = Carta.PALOS[MetodosSueltos.generarNumero(0, 3)];
                numero = Carta.NUMEROS[MetodosSueltos.generarNumero(0, 9)];
                Carta a = new Carta(numero, palo);
                this.cartas.push(a);
            }
        }
    }

    public void barajar() {
        int random = 0;
        for (int i = 0; i < 40; i++) {
            random = MetodosSueltos.generarNumero(0, 39);
            this.cartas.get(random);
            this.cartas.remove(random);
            this.cartas.push(this.cartas.get(random));
        }
    }

    public Carta siguienteCarta() {
        return this.cartas.pop();
    }

    public Enumeration<Carta> cartasDisponibles() {
        return this.cartas.elements();
    }
    
    public Stack<Carta> darCartas(int pedidas){
        Stack<Carta> aDevolver = null;
        
        if (this.cartas.size()< pedidas) {
            System.out.println("No hay suficientes cartas");
        }else{
            aDevolver = new Stack<Carta>();
            for (int i = 0; i < pedidas; i++) {
                aDevolver.push(this.cartas.pop());
            }
        }
        
        return aDevolver;
    }
}
