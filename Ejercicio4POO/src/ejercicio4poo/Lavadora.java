/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4poo;

/**
 *
 * @author Daniel
 */
public class Lavadora extends Electrodomestico {

    private static final int CARGA = 5;

    private int carga;

    public Lavadora(int carga, double precio_base, String color, char consumo, double peso) {
        super(precio_base, color, consumo, peso);
        this.carga = carga;
    }

  public Lavadora(double precio_base, double peso){
        
    }

    
  
    public Lavadora(){
        
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }
    
    

    public double precioFinal(double añadir){
       
        if (carga>30){
            añadir+=50;
        }
  
        return super.precio_base + añadir;
    }
}
