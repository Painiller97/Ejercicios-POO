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
public class Almacen {

    private Bebida[][] estanteria;

    public Almacen() {
        estanteria = new Bebida[3][3];
    }

    public Bebida[][] getEstanteria() {
        return estanteria;
    }

    public void setEstanteria(Bebida[][] estanteria) {
        this.estanteria = estanteria;
    }

    @Override
    public String toString() {
        return "Almacen{" + "estanteria=" + estanteria + '}';
    }

    public double calcularPrecioBebidas() {

        double precio = 0;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j] != null) {
                    precio += estanteria[i][j].getPrecio();
                }
            }
        }

        return precio;

    }

    public double calcularPrecioMarcaBebidas(String marca) {

        double precio = 0;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j] != null) {

                    if (estanteria[i][j].getMarca().equals(marca)) {
                        precio += estanteria[i][j].getPrecio();
                    }

                }
            }

        }

        return precio;
    }
    
    public double calcularPrecioColumnaBebidas(int columna) {
 
        double precio = 0;
        if (columna >= 0 && columna < estanteria[0].length) {
 
            for (int i = 0; i < estanteria.length; i++) {
 
                if (estanteria[i][columna] != null) {
                    precio += estanteria[i][columna].getPrecio();
                }
 
            }
 
        } else {
            System.out.println("No hay columna.");
        }
 
        return precio;
 
    }
    
    public void agregarProducto(Bebida b) {
 
        boolean producto = false;
        for (int i = 0; i < estanteria.length && !producto; i++) {
            for (int j = 0; j < estanteria[0].length && !producto; j++) {
                if (estanteria[i][j] == null) {
                    estanteria[i][j] = b;
                    producto = true;
                }
            }
        }

        if (producto) {
            System.out.println("Bebida añadida.");
        } else {
            System.out.println("No hay bebida.");
        }
 
    }
    
    public void eliminarProducto(int id) {
 
        boolean bebida = false;
        for (int i = 0; i < estanteria.length && !bebida; i++) {
            for (int j = 0; j < estanteria[0].length && !bebida; j++) {
                if (estanteria[i][j] != null) {
                    if (estanteria[i][j].getIdentificador() == id) {
                        estanteria[i][j] = null;
                        bebida = true;
                    }
                }
            }
        }

        if (bebida) {
            System.out.println("Bebida eliminada.");
        } else {
            System.out.println("No hay bebida.");
        }
 
    }
    
    public void mostrarBebidas() {
 
         
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j] != null) {
                    System.out.println("fila " + i + ", columna: " + j + " Bebida: " + estanteria[i][j].toString());
                }
            }
        }
 
    }

}
