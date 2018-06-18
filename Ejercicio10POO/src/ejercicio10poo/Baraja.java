/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10poo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Baraja {

    public static final int CARTAS = 40;

    private Stack<Carta> cartas;
    private Stack<Carta> cartasfuera;

    public Baraja() {
        this.cartas = new Stack<Carta>();
        this.cartasfuera = new Stack<Carta>();
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
            random = MetodosSueltos.generarNumero(0, 37);
            this.cartas.get(random);
            this.cartas.remove(random);
            this.cartas.push(this.cartas.get(random));
        }
    }

    public Carta siguienteCarta() {
        Carta cartasig = this.cartas.pop();
        this.cartasfuera.push(cartasig);
        return cartasig;
    }

    public int cartasDisponibles() {
        return this.cartas.size();
    }
    
    public Stack<Carta> darCartas(int pedidas){
        Stack<Carta> aDevolver = null;
        
        if (this.cartas.size()< pedidas) {
            System.out.println("No hay suficientes cartas");
        }else{
            aDevolver = new Stack<Carta>();
            for (int i = 0; i < pedidas; i++) {
                aDevolver.push(siguienteCarta());
            }
        }
        
        return aDevolver;
    }
    
    private void printStackCartas(Stack<Carta> cartas){
        Iterator<Carta> ite = cartas.iterator();
        
        while(ite.hasNext()){
            Carta c= ite.next();
            System.out.println(c);
        }
    }
    
    public void cartasMonton(){
        if(this.cartasfuera.size()==0){
            System.out.println("No ha salido ninguna carta");
        }else{
            System.out.println("Cartas que ya han salido");
            this.printStackCartas(this.cartasfuera);
        }
        
    }
}
