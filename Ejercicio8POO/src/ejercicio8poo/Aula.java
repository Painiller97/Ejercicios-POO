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
    private final int MAXIMO=20;
    
    private int identificador;
    private int maximo;
    private String destinada;

    public Aula(int identificador, int maximo, String destinada) {
        this.identificador = identificador;
        this.maximo = maximo;
        this.destinada = destinada;
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
    
    
}
