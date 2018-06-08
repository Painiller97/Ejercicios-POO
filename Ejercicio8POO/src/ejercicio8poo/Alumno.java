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
public class Alumno extends Persona {

    private double nota;

    public Alumno(double nota, String nombre, int edad, String sexo, boolean asistencia) {
        super(nombre, edad, sexo);
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nota=" + nota + '}';
    }

    public void asiste() {

        int falta = MetodosSueltos.generarNumero(0, 100);

        if (falta < 50) {
            super.setAsistencia(false);
        } else {
            super.setAsistencia(true);
        }
    }

}
