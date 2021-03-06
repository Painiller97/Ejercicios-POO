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
public class Persona {

    public final String[] NOMBRESH = {"Juan", "Antonio", "Sergio"};
    public final String[] NOMBRESM = {"Sara", "Clara", "Elena"};
    public final int HOMBRE = 0;
    public final int MUJER = 1;

    private String nombre;
    private int edad;
    private String sexo;
    private boolean asistencia;

    public Persona(int edad) {
        this.edad = edad;
        

        int generaSexo = MetodosSueltos.generarNumero(0, 1);

        if (generaSexo == 0) {
            nombre = NOMBRESH[MetodosSueltos.generarNumero(0, 2)];
            sexo = "H";
        } else {
            nombre = NOMBRESM[MetodosSueltos.generarNumero(0, 2)];
            sexo = "M";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + '}';
    }

}
