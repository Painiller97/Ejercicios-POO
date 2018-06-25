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
    private boolean decision;

    public Jugador() {
        this.dinero = DINERO;
        this.nombre = NOMBRES[MetodosSueltos.generarNumero(0, 3)];
        int decisionVictoria = MetodosSueltos.generarNumero(0, 1);

        if (decisionVictoria == 0){ 
            decision = true;
        } else {
            decision = false;
        }
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDecision() {
        return decision;
    }

    public void setDecision(boolean decision) {
        this.decision = decision;
    }

    @Override
    public String toString() {
        return "Jugador{" + "DINERO=" + DINERO + ", NOMBRES=" + NOMBRES + ", dinero=" + dinero + ", nombre=" + nombre + ", decision=" + decision + '}';
    }

    public void ponerDinero() {
        
    }

    @Override
    public void empezarPorra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
