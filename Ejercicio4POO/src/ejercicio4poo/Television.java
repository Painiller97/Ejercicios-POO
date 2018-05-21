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
public class Television extends Electrodomestico {

    private static final int RESOLUCION = 20;
    private static final boolean TDT = false;

    private int pulgadas;
    private boolean sintonizador;

    public Television(int pulgadas, boolean sintonizador, double precio_base, String color, char consumo, double peso) {
        super(precio_base, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;

    }

    public Television(double precio_base, double peso) {
        super(precio_base, peso);

    }

    public Television() {
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public double precioFinal() {

        double añadir = 0;

        if (pulgadas > 40) {
            añadir += super.precio_base * 0.3;
        }
        if (sintonizador) {
            añadir += 50;
        }

        return super.precio_base + añadir;
    }

}
