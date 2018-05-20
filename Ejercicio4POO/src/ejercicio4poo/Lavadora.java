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
        this(precio_base, peso, CONSUMO, COLOR, CARGA);
    }

    private Lavadora(double precio_base, double peso, char CONSUMO, String COLOR, int CARGA) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    public Lavadora(){
        this(PRECIO, PESO, CONSUMO, COLOR, CARGA);
    }

}
