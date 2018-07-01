/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15poo;

/**
 *
 * @author Daniel
 */
public class Agenda {

    private Contacto[] contactos;

    public Agenda() {
        this.contactos = new Contacto[10];
    }

    public Contacto[] getContactos() {
        return contactos;
    }

    public void setContactos(Contacto[] contactos) {
        this.contactos = contactos;
    }

    @Override
    public String toString() {
        return "Agenda{" + "contactos=" + contactos + '}';
    }

    public void anadirContacto(Contacto c) {

        if (existeContacto(c)) {
            System.out.println("El contacto ya existe.");
        } else if (agendaLlena()) {
            System.out.println("La agenda está llena.");
        } else {

            boolean encontrado = false;
            for (int i = 0; i < contactos.length && !encontrado; i++) {
                if (contactos[i] == null) {
                    contactos[i] = c;
                    encontrado = true;
                }
            }

            if (encontrado) {
                System.out.println("Añadido.");
            } else {
                System.out.println("No pudo añadir.");
            }
        }

    }

    public boolean existeContacto(Contacto c) {

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && c.equals(contactos[i])) {
                return true;
            }
        }
        return false;

    }

    public void listarContactos() {

        if (huecosLibre() == contactos.length) {
            System.out.println("No hay contactos.");
        } else {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] != null) {
                    System.out.println(contactos[i]);
                }
            }
        }

    }

    public void buscarPorNombre(String nombre) {

        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] != null && contactos[i].getNombre().equals(nombre)) {
                System.out.println("El telefono es " + contactos[i].getTelefono());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado el contacto.");
        }

    }

    public boolean agendaLlena() {

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                return false;
            }
        }

        return true;

    }
    
    public void eliminarContacto(Contacto c) {
 
        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] != null && contactos[i].equals(c)) {
                contactos[i] = null; 
                encontrado = true; 
            }
        }
 
        if (encontrado) {
            System.out.println("Se ha eliminado el contacto.");
        } else {
            System.out.println("No se ha eliminado el contacto.");
 
        }
 
    }
    
    public int huecosLibre() {
 
        int libres = 0;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                libres++; 
            }
        }
 
        return libres;
    }
}
