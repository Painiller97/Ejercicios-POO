/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18poo;

/**
 *
 * @author Alumno
 */
public class Pregunta {
    
    private String pregunta;
    private Opcion opciones[];
    private Opcion opcionCorrecta;
    private int puntos;

    public Pregunta(String pregunta, Opcion opciones[], Opcion opcionCorrecta, int puntos) {
        this.pregunta = pregunta;
        this.opciones[] = new opciones[3];
        this.opcionCorrecta = opcionCorrecta;
        this.puntos = puntos;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public Opcion[] getOpciones() {
        return opciones;
    }

    public void setOpciones(Opcion[] opciones) {
        this.opciones = opciones;
    }

    public Opcion getOpcionCorrecta() {
        return opcionCorrecta;
    }

    public void setOpcionCorrecta(Opcion opcionCorrecta) {
        this.opcionCorrecta = opcionCorrecta;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    public void mostrarPregunta(){
        Opcion o1 = new Opcion("Opcion 1", false);
        Opcion o2 = new Opcion("Opcion 2", true);
        Opcion o3 = new Opcion("Opcion 3", false);
        System.out.println("; " + this.pregunta + " ;");
        this.opciones[] = [o1, o2, o3];
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        
    }
    
    public void comprobarRespuesta(int respuestaUsuario){
        
    }
}
