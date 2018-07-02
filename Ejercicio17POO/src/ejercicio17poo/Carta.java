/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17poo;

/**
 *
 * @author Daniel
 */
public class Carta {
    public enum PalosBarEspañola {
    OROS, COPAS, ESPADAS, BASTOS 
}
    
    public enum PalosBarFrancesa {
    DIAMANTES, PICAS, TREBOLES, CORAZONES 
}
    
    public static final int[] NUMEROS = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
    public static final int[] NUMEROSJUGAR = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    public static final int[] NUMEROSFRANCESA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    public static final String[] PALOSESPAÑOLA = {"Bastos", "Copas", "Espadas", "Oros"};
    public static final String[] PALOSFRANCESA = {"Diamantes", "Picas", "Corazones", "Treboles"};
    
    private int numero;
    private String palo;
    private String paloFrancesa;

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
        this.paloFrancesa = paloFrancesa;
    }

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
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

    public String getPaloFrancesa() {
        return paloFrancesa;
    }

    public void setPaloFrancesa(String paloFrancesa) {
        this.paloFrancesa = paloFrancesa;
    }
    
    
    
    
}
