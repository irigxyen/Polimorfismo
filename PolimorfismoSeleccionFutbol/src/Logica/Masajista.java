/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Karla
 */
public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(String titulacion, int aniosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

	
   @Override
   public void entrenamiento() {
      System.out.println("Da asistencia en el entrenamiento");
   }

   public void darMasaje() {
      System.out.println("Da un Masaje");
   }

    
}
