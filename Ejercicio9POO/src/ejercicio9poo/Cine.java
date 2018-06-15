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

    private Pelicula pelicula;
    private double precioEntrada;
    private Asiento asientos[][];

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLACK = "\u001B[30m";

    public Cine(Pelicula pelicula, double precioEntrada) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        
        this.asientos = new Asiento[8][9];
        this.crearAsientos();
        this.imprimirAsientos();
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
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

    private void crearAsientos() {
        String col = "ABCDEFGHI";
        Asiento a;
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j < col.length(); j++) {
                a=new Asiento(i+1 + "" + col.charAt(j),false);
                this.asientos[i][j]=a;
            }
        }
    }
    
    public void imprimirAsientos(){
        Asiento asiento;
        for (int i = 7; i >=0; i--) {
            for (int j = 0; j < 9; j++) {
                asiento=this.asientos[i][j];
                if(asiento.isOcupado()){
                    System.out.print(Cine.ANSI_RED);
                }else{
                    System.out.print(Cine.ANSI_GREEN);
                }
                System.out.print(asiento.getEtiqueta()+" ");
            }
            System.out.println("");
        }
    }
}
