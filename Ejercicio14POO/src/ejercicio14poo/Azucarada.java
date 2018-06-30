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
public class Azucarada extends Bebida{
    
    private double azucar;
    private boolean promocion;

    public Azucarada(double azucar, boolean promocion, int identificador, double litros, double precio, String marca) {
        super(identificador, litros, precio, marca);
        this.azucar = azucar;
        this.promocion = promocion;
    }

    public double getAzucar() {
        return azucar;
    }

    public void setAzucar(double azucar) {
        this.azucar = azucar;
    }

    public boolean isPromocion() {
        return promocion;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
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
        return "Azucarada{" + "azucar=" + azucar + ", promocion=" + promocion + '}';
    }
    
    
}
