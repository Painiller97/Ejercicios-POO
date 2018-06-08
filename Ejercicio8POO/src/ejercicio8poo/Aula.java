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
public class Aula {

    public final String[] MATERIADESTINADA = {"Matematicas", "Filosofia", "Fisica"};
    public final int MAXIMO = 10;

    private int identificador;
    private int maximo;
    private String destinada;
    
    

    public Aula(int identificador) {
        this.identificador = identificador;
        this.maximo = MAXIMO;
        this.destinada = MATERIADESTINADA[MetodosSueltos.generarNumero(0,3)];
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
    
    public boolean permitirClase(Profesor profesor){
        
        if(profesor.getMateria().equals(this.destinada) && profesor.asiste() == true && maximo > (maximo/2)){
            System.out.println("Se puede dar clase");
            return true;
            
        }
        else{
            System.out.println("No se puede dar clase");
            return false;
        }
        
        
    }
    
}
