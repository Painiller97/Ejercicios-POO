/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8poo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Daniel
 */
public class Aula {

    public final String[] MATERIADESTINADA = {"Matematicas", "Filosofia", "Fisica"};
    public final int MAXIMO = 6;

    private int identificador;
    private int maximo;
    private String destinada;
    private ArrayList<Alumno> alumnos;
    private Profesor profe;

    public Aula(int identificador) {
        this.identificador = identificador;
        this.maximo = MAXIMO;
        this.destinada = MATERIADESTINADA[MetodosSueltos.generarNumero(0, 2)];

        this.alumnos = new ArrayList<Alumno>();
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public String getDestinada() {
        return destinada;
    }

    public void setDestinada(String destinada) {
        this.destinada = destinada;
    }

    public boolean permitirClase() {
        ArrayList<String> causas=new ArrayList<String>();
        
        if(!profe.getMateria().equals(this.destinada)){
            causas.add("El profesor se equivoco de aula");
        }
        
        if(!profe.asiste()){
            causas.add("El profesor no asiste a clase");
        }
        
        if (alumnos.size() >= (maximo / 2)) {
            causas.add("Hay muy pocos alumnos");
        }
        
        System.out.println();
        if (causas.size()==0) {
            System.out.println("Se puede dar clase");
            return true;
        } else {
            System.out.println("No se puede dar clase");
            for (Iterator<String> iterator = causas.iterator(); iterator.hasNext();) {
                String causa = iterator.next();
                System.out.println("-"+causa);
            }
            return false;
        }
    }

    public void addAlumno(Alumno a) {

        if (a.asiste()) {
            this.alumnos.add(a);
        }

    }

    public void setProfesor(Profesor p) {
        this.profe = p;
        if (p.asiste()) {
            this.profe = p;;
        }
    }
}
