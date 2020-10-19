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
public abstract class SeleccionFutbol {
        protected int id;
	protected String nombre;
	protected String apellidos;
	protected int edad;

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


	public void viajar() {
	     System.out.println("Viaja al Partido");
	}

	public void concentrarse() {
	     System.out.println("Concentrarse");
	}

	public abstract void entrenamiento();

	public void partidoFutbol() {
	     System.out.println("Asiste al Partido de Fútbol");
	}

}
