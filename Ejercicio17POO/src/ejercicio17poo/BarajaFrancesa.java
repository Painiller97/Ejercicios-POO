/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17poo;

/**
 *
 * @author Alumno
 */
public class BarajaFrancesa extends Baraja{
    public final int TOTAL = 52;
    
    public void crearBaraja() {
        int numero;
        String palo;
        for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 13; j++) {
                    palo = Carta.PALOSFRANCESA[MetodosSueltos.generarNumero(0, 3)];
                    numero = Carta.NUMEROSFRANCESA[MetodosSueltos.generarNumero(0, 12)];
                    Carta a = new Carta(numero, palo);
                    this.cartas.push(a);
                }
           
        }
    }
    
    public boolean cartaRoja(Carta c){
        if (c.getPaloFrancesa().equals("Corazones") || c.getPaloFrancesa().equals("Diamantes")){
            return true;
        }
        else{
            return false;
        }
    }
    
     public boolean cartaNegra(Carta c){
        if (c.getPaloFrancesa().equals("Treboles") || c.getPaloFrancesa().equals("Picas")){
            return true;
        }
        else{
            return false;
        }
    }
     
    @Override
    public String toString() {
         return "BarajaFrancesa{" + "TOTAL=" + TOTAL + '}';
        
    }
     
}
