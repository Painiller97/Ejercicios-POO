/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11poo;

/**
 *
 * @author Alumno
 */
public class Jugador implements PorraFutbol {
    public final double DINERO = 15;
    public final String[] NOMBRES = {"Alex", "Susana ", "Alfonso", "Aurora"};
    
    private double dinero;
    private String nombre;
    private boolean partido;
    private boolean decision;

    public Jugador(boolean partido, boolean decision) {
        this.dinero = DINERO;
        this.nombre = NOMBRES[MetodosSueltos.generarNumero(0, 3)];
        this.partido = partido;
        this.decision = decision;
    }
    
    
    
}
