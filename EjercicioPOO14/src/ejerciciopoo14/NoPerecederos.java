package ejerciciopoo14;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class NoPerecederos extends Productos{
    
    private String tipo;

    public NoPerecederos(String tipo, String nombre, double precio) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "NoPerecederos{" + "tipo=" + tipo + '}';
    }

    @Override
    public void calcular(double numProductos) {
        numProductos = 4;
        double calculo = precio * numProductos;
    }
    
    
}
