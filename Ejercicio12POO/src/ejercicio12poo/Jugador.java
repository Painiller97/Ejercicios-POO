/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12poo;

/**
 *
 * @author Daniel
 */
public class Jugador {
    private int id;
    private String nombre;
    private boolean vivo;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador: " + id;
        this.vivo = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", vivo=" + vivo + '}';
    }
    
    public void disparar(Revolver r) {
        if(r.disparar() == true){
            vivo = false;
            System.out.println(this.nombre + " se ha muerto.");                   
        }
        else{
            System.out.println(this.nombre + " ha sobrevivido");
        }
    }
}
