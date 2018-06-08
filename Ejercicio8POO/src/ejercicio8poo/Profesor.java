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
public class Profesor extends Persona {

    public static final String[] ASIGNATURA = {"Matematicas", "Filosofia", "Fisica"};
    private String materia;

    public Profesor(String materia, String nombre, int edad, String sexo, boolean asistencia) {
        super(nombre, edad, sexo);
        this.materia = ASIGNATURA[MetodosSueltos.generarNumero(0, 2)];
        this.materia = materia;
    }

}
