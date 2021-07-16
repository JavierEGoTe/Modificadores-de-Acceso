package paquete1;

public class Persona {
	//Modificador de acceso deafult, se puede acceder a los objetos dentro del
	//mismo paquete y clase
	String nombre = "";
	//Modificador de acceso privado, se puede acceder a el solo dentro de la }
	//misma clase
	private int edad=0;
	//Modificador protected, se puede acceder a el dentrto de la misma clase y 
	//y el mismo paquete
	protected String domicilio = "";
	//Modificador de acceso publico, se puede acceder dentro de la misma clase y
	//otros paquetes
	public float estatura =0;
	String saludar() {
		return "Hola mi nombre es "+this.nombre + " mi edad es "+ this.edad
				+ " mi domicilio es: "+ this.domicilio + " mi estatura es " + this.estatura;
	}
}
