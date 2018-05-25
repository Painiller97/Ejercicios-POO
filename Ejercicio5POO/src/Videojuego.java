/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pues4Aula4
 */
public class Videojuego {
    static final int HORAS = 10;
    static final boolean ENTREGADO = false;
    
    private String titulo;
    private int horas;
    private boolean entregado;
    private String genero;
    private String compañia;

    public Videojuego(String titulo, int horas, String genero, String compañia) {
        this.titulo = titulo;
        this.horas = horas;
        this.entregado = ENTREGADO;
        this.genero = genero;
        this.compañia = compañia;
    }

    public Videojuego(String titulo, int horas) {
        this.titulo = titulo;
        this.horas = horas;
        this.entregado = ENTREGADO;
        this.genero = " Género no especificado ";
        this.compañia = " Compañía no especificada ";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return "Videojuego{" + "titulo=" + titulo + ", horas=" + horas + ", entregado=" + entregado + ", genero=" + genero + ", compa\u00f1ia=" + compañia + '}';
    }

    

}

