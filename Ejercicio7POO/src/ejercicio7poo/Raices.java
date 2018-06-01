/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7poo;

/**
 *
 * @author Pues4Aula4
 */
public class Raices {

    private double a;
    private double b;
    private double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminante() {
        double discriminante = (this.b * this.b) - 4 * this.a * this.c;
        return discriminante;
    }

    public boolean tieneRaices() {
        boolean raices = false;
        if (this.getDiscriminante() >= 0) {
            raices = true;
        }
        return raices;
    }

    public boolean tieneRaiz() {
        boolean raiz = false;
        if (this.getDiscriminante() < 0) {
            raiz = true;
        }
        return raiz;
    }

    public void obtenerRaices() {
        if (this.tieneRaices() == true) {
            double s1 = (-this.b + Math.sqrt(
                    Math.pow(this.b, 2) - 4 * this.a * this.c
            )) / (2 * this.a);
            System.out.println("El primer resulttado es " + s1);

            double s2 = (-this.b - Math.sqrt(
                    Math.pow(this.b, 2) - 4 * this.a * this.c
            )) / (2 * this.a);
            System.out.println("El segundo resulttado es " + s2);
        }
    }

    public void obtenerRaiz() {
        if (this.tieneRaiz() == true) {
            double s = (-this.b + Math.sqrt(
                    Math.pow(this.b, 2) - 4 * this.a * this.c
            )) / (2 * this.a);
            System.out.println("El resultado es " + s);
        }
    }
}
