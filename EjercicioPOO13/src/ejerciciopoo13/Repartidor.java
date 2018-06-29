/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo13;

/**
 *
 * @author Alumno
 */
public class Repartidor extends Empleado{
    
    private String zona;

    public Repartidor(String zona, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Repartidor{" + "zona=" + zona + '}';
    }

    @Override
    public void darPlus() {
       if(edad > 25 && zona.equals("zona 3")){
           salario = salario + PLUS;
       }
    }
    
    
}
