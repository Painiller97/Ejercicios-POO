/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo14;

/**
 *
 * @author Alumno
 */
public class Perecedero extends Productos{
    
    private int diasCaducar;

    public Perecedero(int diasCaducar, String nombre, double precio) {
        super(nombre, precio);
        this.diasCaducar = diasCaducar;
    }

    public int getDiasCaducar() {
        return diasCaducar;
    }

    public void setDiasCaducar(int diasCaducar) {
        this.diasCaducar = diasCaducar;
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
        return "Perecedero{" + "diasCaducar=" + diasCaducar + '}';
    }

    
    public void calcular(double numProductos) {
        double calculo = precio * numProductos;
        if(diasCaducar == 3){
            calculo = calculo / 2;
        }
        else if(diasCaducar == 2){
            calculo = calculo / 3;
        }
        else if(diasCaducar == 1){
            calculo = calculo / 4;
        }
    }
    
    
    
}
