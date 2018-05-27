/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pues4Aula4
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Serie listaseries[] = new Serie[4];
        listaseries[0] = new Serie("Evangelion", 3, "Mecha", "Hideaki Anno");
        listaseries[1] = new Serie("Dragon Ball", "Akira Toriyama");
        listaseries[2] = new Serie();
        listaseries[0] = new Serie("One Punch Man", 3, "Acción", "One");

        Videojuego listajuegos[] = new Videojuego[4];
        listajuegos[0] = new Videojuego("Minecraft", 200);
        listajuegos[1] = new Videojuego("Dragon Quest", 90, "RPG", "Square Enix");
        listajuegos[2] = new Videojuego("Call of Duty", 120);
        listajuegos[3] = new Videojuego("Super Mario Bros", 40, "Plataformas", "Nintendo");

        listajuegos[2].entregar();
        listajuegos[0].entregar();
        listajuegos[2].devolver();

        listaseries[1].entregar();
        listaseries[3].entregar();
        listaseries[0].entregar();

        int contar = 0;

        for (int i = 0; i < listaseries.length; i++) {
            if (listaseries[i].isEntregado()) {
                contar += 1;
                listaseries[i].devolver();

            }
            if (listajuegos[i].isEntregado()) {
                contar += 1;
                listajuegos[i].devolver();
            }
        }
        System.out.println("Se han entregado " + contar + " series y videojuegos");
    }
}
