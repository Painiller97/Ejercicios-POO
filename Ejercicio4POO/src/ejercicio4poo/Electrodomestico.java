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
    
    public static enum Color
    {
        BLANCO,
        NEGRO,
        ROJO,
        AZUL,
        GRIS
    }
    
    private static final double PRECIO_BASE=100;
    private static final Color COLOR=Color.BLANCO;
    private static final char CONSUMO=100;
    private static final double PESO=100;
    
    
    private double precio_base;
    private String color;
    private char consumo;
    private double peso; 
    
}
