/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo6;

/**
 *
 * @author Daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro("164738498", "Harry Potter", "J.K. Rowling", 400);
        System.out.println(libro1);
        
        Libro libro2 = new Libro("343454359", "Crónicas de la Torre", "Laura Gallego", 350);
        System.out.println(libro2);
        
        if(libro1.getPaginas() > libro2.getPaginas()){
            System.out.println("El libro " + libro1.getTitulo() + " tiene más páginas");
        }
        else{
            System.out.println("El libro " + libro2.getTitulo() + " tiene más páginas");
        }
    }
    
}
