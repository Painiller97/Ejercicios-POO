/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9poo;

/**
 *
 * @author Pues4Aula4
 */
public class Cine {

    private String pelicula;
    private double precioEntrada;
    private String asientos[][] = new String[7][8];

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLACK = "\u001B[30m";

    public Cine(String pelicula, double precioEntrada) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", precioEntrada=" + precioEntrada + '}';
    }

    public static void crearAsientos() {
        String asientos[][] = new String[10][10];
        String col = "ABCDEFGHI";
        for (int i = 1; i <= 8; i++) {
            for (int j = 0; j < col.length(); j++) {
                asientos[i][j] = i + "" + col.charAt(j);
                if(i%3==0){
                    System.out.print(Cine.ANSI_GREEN);
                }else if(i%2==0){
                    System.out.print(Cine.ANSI_RED);
                }
                System.out.print(asientos[i][j] + " ");
                System.out.print(Cine.ANSI_BLACK);
            }
            System.out.println("");
        }

    }
}
