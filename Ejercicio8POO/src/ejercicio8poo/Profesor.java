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

    public Profesor(String materia,int edad) {
        super(edad);
        this.materia = materia;
    }

    public Profesor(int edad) {
        super(edad);
        this.materia = ASIGNATURA[MetodosSueltos.generarNumero(0, 2)];
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public boolean asiste() {

        int falta = MetodosSueltos.generarNumero(0, 100);

        if (falta < 20) {
            return false;
        } else {
            return true;
        }
    }
    

}
