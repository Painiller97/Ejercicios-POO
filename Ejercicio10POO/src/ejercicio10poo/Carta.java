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
public class Carta {
    public static final int[] NUMEROS = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
    public static final String[] PALOS = {"Bastos", "Copas", "Espadas", "Oros"};
    
    private int numero;
    private String palo;

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "NUMEROS=" + NUMEROS + ", PALOS=" + PALOS + ", numero=" + numero + ", palo=" + palo + '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    
}
