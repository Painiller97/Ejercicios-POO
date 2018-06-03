/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8poo;

/**
 *
 * @author Daniel
 */
public class Alumno extends Persona{
    private double nota;

    public Alumno(double nota, String nombre, int edad, String sexo, boolean asistencia) {
        super(nombre, edad, sexo, asistencia);
        this.nota=nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
}
