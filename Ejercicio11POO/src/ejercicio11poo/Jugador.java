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
        if (this.dinero > 1){
            this.dinero -= 1;
            Bote.total += 1;
        }
        else{
            System.out.println(this.nombre + " no tiene suficiente dinero para apostar.");
        }
    }

    
    public void empezarPorra(Partido p) {
        if (Bote.ganado == false){
            if(this.decision == p.isVictoria()){
                System.out.println("El jugador " + this.nombre + " ha acertado.");
                this.dinero = dinero + Bote.total;
                Bote.ganado = true;
            }
            else{
                System.out.println("El jugador " + this.nombre + " ha fallado.");
            }
    }
        else{
            System.out.println("El bote ya ha sido ganado");
        }
    }
    
    
}
