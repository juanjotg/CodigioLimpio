package com.jjtg.codigoLimpio.singleton.mal;

public class GestorIO {

		/*
		 * Esta clase no sería correcta del todo porque no hemos hecho ningun objeto.
		 * Expone funciones estáticas que se pueden llamar desde cualquier sitio, son funciones libres.
		 * Esto es como volver a la progrmación tradicional y dejar la POO.
		 * Para utilizar esta clase no hay que hacer ningún objeto.
		 * Sería recomendable hacer esta clase para que pueda instanciarse como un objeto y así podriamos
		 * pasarla como parámetro, hacer inyección de depencias de este objeto, componerlo como parte de otro ....
		 * Tener las cosas en objetos nos da muchas posibilidades
		 */
	
	
		public static void escribir () {
			
			System.out.println("Estoy escribiendo");
			
		}
	
		public static void leer () {
						
			System.out.println("Estoy leyendo");
			
		} 
		
		public static void main(String[] args) {
						
			GestorIO.escribir();
			GestorIO.leer();
			
		}
}
