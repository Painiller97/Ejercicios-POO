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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumnos[] = new Alumno[10];
        alumnos[0] = new Alumno(8, 15);
        alumnos[1] = new Alumno(6, 16);
        alumnos[2] = new Alumno(3, 12);
        alumnos[3] = new Alumno(5, 13);
        alumnos[4] = new Alumno(10, 17);
        alumnos[5] = new Alumno(8, 14);
        alumnos[6] = new Alumno(1, 19);
        alumnos[7] = new Alumno(7, 17);
        alumnos[8] = new Alumno(6, 18);
        alumnos[9] = new Alumno(0, 23);
        
        Profesor profesor = new Profesor(64);
        
        Aula aula = new Aula(1);
        aula.setProfesor(profesor);
        aula.addAlumno(alumnos[0]);
        aula.addAlumno(alumnos[1]);
        aula.addAlumno(alumnos[2]);
        aula.addAlumno(alumnos[3]);
        aula.addAlumno(alumnos[4]);
        aula.permitirClase();
        
    }
    
}
