/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12poo;

/**
 *
 * @author Daniel
 */
public class Revolver {
    private int posActual;
    private int posBala;

    public Revolver() {
        this.posActual = MetodosSueltos.generarNumero(0, 5);
        this.posBala = MetodosSueltos.generarNumero(0, 5);
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosBala() {
        return posBala;
    }

    public void setPosBala(int posBala) {
        this.posBala = posBala;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posActual=" + posActual + ", posBala=" + posBala + '}';
    }
    
    public boolean disparar() {
 
        boolean muerto = false;
 
        if (posBala == posActual) {
            muerto = true; 
        }
 
        siguienteBala();
 
        return muerto;
    
}
    
    public void siguienteBala() {
 
        if (posActual == 6) {
            posActual = 1; 
        } else {
            posActual++;
        }
 
    }
 
}