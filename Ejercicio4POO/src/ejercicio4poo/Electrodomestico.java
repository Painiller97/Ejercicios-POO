/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4poo;

/**
 *
 * @author Pues4Aula4
 */
public class Electrodomestico {

 

    private static final double PRECIO_BASE = 100;
    private static final String COLOR = "BLANCO";
    private static final char CONSUMO = 'F';
    private static final double PESO = 5;

    private double precio_base;
    private String color;
    private char consumo;
    private double peso;

    public Electrodomestico() {
        this.precio_base = PRECIO_BASE;
        this.color = color;
        this.consumo = CONSUMO;
        this.peso = PESO;
    }

    public Electrodomestico(double precio_base, double peso) {
        this.precio_base = precio_base;
        this.peso = peso;
        this.color = color;
        this.consumo = CONSUMO;
    }

    public Electrodomestico(double precio_base, String color, char consumo, double peso) {
        this.precio_base = precio_base;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio_base=" + precio_base + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }

    public void comprobarConsumoEnergetico(char letra) {
        //if (letra.equals('A')) {
            //no deja comprobar que sea igual a A
        //}
    }

    public void comprobarColor(String color) {
        if (color.equals("BLANCO") || color.equals("NEGRO") || color.equals("ROJO") || color.equals("AZUL") || color.equals("GRIS")) {
            this.color = color;
        }
        else{
            this.color = COLOR;
        }
    }

}
