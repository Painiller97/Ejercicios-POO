/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9poo;

/**
 *
 * @author Pues4Aula4
 */
public class Espectador {
    public final String[] NOMBRES = {"Pepe", "Ana", "Manolo", "Sara", "Max", "Clara", "Sergio"};
    public final int[] EDADES = {14, 18, 26, 8, 19, 108, 32, 15};
    public final double[] DINEROS = {8.30, 2.01, 500.50, 20.60, 9.20, 10, 2.10, 1, 23.44};    
    private String nombre;
    private int edad;
    private double dinero;

    public Espectador() {
        this.nombre = NOMBRES[MetodosSueltos.generarNumero(0, 6)];
        this.edad = EDADES[MetodosSueltos.generarNumero(0, 7)];
        this.dinero = DINEROS[MetodosSueltos.generarNumero(0, 8)];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + '}';
    }
    
    
}
