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

    static final double PRECIO = 100;
    static final String COLOR = "BLANCO";
    static final char CONSUMO = 'F';
    static final double PESO = 5;

    double precio_base;
    String color;
    char consumo;
    private double peso;

    public Electrodomestico() {
        this.precio_base = PRECIO;
        this.color = COLOR;
        this.consumo = CONSUMO;
        this.peso = PESO;
    }

    public Electrodomestico(double precio_base, double peso) {
        this.precio_base = precio_base;
        this.peso = peso;
        this.color = color;
        this.consumo = CONSUMO;
    }

    public Electrodomestico(double precio_base, double peso, String color, char consumo ) {
        this.precio_base = precio_base;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
        this.comprobarConsumoEnergetico(consumo);
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

    private void comprobarConsumoEnergetico(char consumo) {
        int consumInt=(int)consumo;
        if(consumInt>=65 && consumInt<=70){
            this.consumo=consumo;
        }else{
            this.consumo=Electrodomestico.CONSUMO;
        }
    }

    public void comprobarColor(String color) {
        if (color.equals("BLANCO") || color.equals("NEGRO") || color.equals("ROJO") || color.equals("AZUL") || color.equals("GRIS")) {
            this.color = color;
        } else {
            this.color = COLOR;
        }
    }

    public double precioFinal() {
        double añade = 0;
        switch (consumo) {
            case 'A':
                añade += 100;
                break;
            case 'B':
                añade += 80;
                break;
            case 'C':
                añade += 60;
                break;
            case 'D':
                añade += 50;
                break;
            case 'E':
                añade += 30;
                break;
            case 'F':
                añade += 10;
                break;

        }
        if (peso >= 0 && peso < 19) {
            añade += 10;
        } else if (peso >= 20 && peso < 49) {
            añade += 50;
        } else if (peso >= 50 && peso <= 79) {
            añade += 80;
        } else if (peso >= 80) {
            añade += 100;
        }

        return this.precio_base + añade;
    }

}
