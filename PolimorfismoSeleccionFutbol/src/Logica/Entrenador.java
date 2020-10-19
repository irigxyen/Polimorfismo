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
public class Entrenador extends SeleccionFutbol {
    private int idFederacion;

    public Entrenador(int idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }


   @Override
   public void entrenamiento() {
      System.out.println("Dirige un entrenamiento");
   }

   @Override
   public void partidoFutbol() {
      System.out.println("Dirige un Partido");
   }

   public void planificarEntrenamiento() {
      System.out.println("Planificar un Entrenamiento");
   }

}
