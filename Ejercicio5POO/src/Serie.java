
import ejercicio5poo.Entregable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pues4Aula4
 */
public class Serie implements Entregable {

    static final int TEMPORADA = 3;
    static final boolean ENTREGADO = false;

    private String titulo;
    private int temporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie(String titulo, int temporadas, String genero, String creador) {
        this.titulo = titulo;
        this.temporadas = temporadas;
        this.entregado = ENTREGADO;
        this.genero = genero;
        this.creador = creador;

    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.temporadas = TEMPORADA;
        this.entregado = ENTREGADO;
        this.genero = " Género no especificado ";
        this.creador = creador;
    }

    public Serie() {
        this.titulo = " Título no especificado ";
        this.temporadas = TEMPORADA;
        this.entregado = ENTREGADO;
        this.genero = " Género no especificado ";
        this.creador = " Creador no especificado ";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", temporadas=" + temporadas + ", entregado=" + entregado + ", genero=" + genero + ", creador=" + creador + '}';
    }

    public boolean entregar() {
        entregado = true;
        return entregado;
    }

    public boolean devolver() {
        entregado = false;
        return entregado;
    }

    public void isEntregado() {
        if (entregado == true) {
            System.out.println(" Está entregado ");
        } else {
            System.out.println(" No está entregado ");
        }
    }

    public void compareTo(Object a) {
        Serie serie = (Serie) a;
        if (this.temporadas > serie.getTemporadas()) {
            System.out.println(1);
        } else if (this.temporadas < serie.getTemporadas()) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
    }

}
