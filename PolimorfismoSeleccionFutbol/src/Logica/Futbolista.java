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
public class Futbolista extends SeleccionFutbol{
    private int dorsal;
    private String demarcacion;

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

   @Override
   public void entrenamiento() {
      System.out.println("Realiza un entrenamiento");
   }

   @Override
   public void partidoFutbol() {
      System.out.println("Juega un Partido");
   }

   public void entrevista() {
      System.out.println("Da una Entrevista");
   }

}
