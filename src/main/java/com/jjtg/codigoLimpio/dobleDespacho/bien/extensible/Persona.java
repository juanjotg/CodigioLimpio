package com.jjtg.codigoLimpio.dobleDespacho.bien.extensible;

public abstract class Persona {

	public void saludar(){
		System.out.println("?????????? Soy una persona que saluda al entrar");
	}
	
	public void despedirse() {
		System.out.println("?????????? Soy una persona que se despide al salir");
	}
	
	public void pedir() {
		System.out.println("?????????? Soy una persona que pide un menú");
	}
	
	public abstract void aceptar(VisitadorPersona visitadorPersona);

}
