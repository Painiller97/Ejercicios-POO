/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14poo;

/**
 *
 * @author Daniel
 */
public class Bebida {
    
    protected int identificador;
    protected double litros;
    protected double precio;
    protected String marca;

    public Bebida(int identificador, double litros, double precio, String marca) {
        this.identificador = identificador;
        this.litros = litros;
        this.precio = precio;
        this.marca = marca;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Bebida{" + "identificador=" + identificador + ", litros=" + litros + ", precio=" + precio + ", marca=" + marca + '}';
    }
    
    
}
