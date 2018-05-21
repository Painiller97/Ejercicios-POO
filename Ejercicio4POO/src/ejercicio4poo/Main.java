/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4poo;

/**
 *
 * @author Pues4Aula4
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrodomestico lista[] = new Electrodomestico[10];

        lista[0] = new Electrodomestico(200, "BLANCO", 'C', 35);
        lista[1] = new Electrodomestico(150, 30);
        lista[2] = new Television();
        lista[3] = new Lavadora();
        lista[4] = new Television(250, 20);
        lista[5] = new Electrodomestico(180, "GRIS", 'D', 40);
        lista[7] = new Lavadora();
        lista[8] = new Television(450, 80);
        lista[9] = new Electrodomestico(50, 10);

        double sumaE = 0;
        double sumaT = 0;
        double sumaL = 0;

        for (int i = 0; i < lista.length; i++) {

            if (lista[i] instanceof Electrodomestico) {
                sumaE += lista[i].precioFinal();
            }
            if (lista[i] instanceof Lavadora) {
                sumaL += lista[i].precioFinal();
            }
            if (lista[i] instanceof Television) {
                sumaT += lista[i].precioFinal();
            }
        }
    }

}
