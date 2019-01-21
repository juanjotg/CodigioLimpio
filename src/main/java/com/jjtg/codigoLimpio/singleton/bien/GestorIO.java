package com.jjtg.codigoLimpio.singleton.bien;

public class GestorIO {

		private static GestorIO gestorIO;	// necesario un atributo estático para guarda la instancia de la clase
	
		private GestorIO() {}  // constructor privado para no permitir construir más instancias desde otros puntos de la aplicación.
	
		public static GestorIO instance () { // necesario método estático (devuelve el singleton)
			
			if (gestorIO == null) { // creación perezosa ( si crear el objeto es muy costosa y poco probable que se llame)
				gestorIO = new GestorIO ();
			}
			
			return gestorIO;  // todo el mundo consigue la misma dirección de memoria de un único objeto de esta clase
			
		}
		
		public void escribir() {
			
			System.out.println("Estoy escribiendo");
			
		}
	
		public void leer() {
						
			System.out.println("Estoy leyendo");
			
		} 
		
		public void main(String[] args) {
						
			// GestorIO.instance() --> devuelve un objeto, puedo lanzar el mensaje "escribir" o pasarlo como parámetro
			
			GestorIO.instance().escribir();
			GestorIO.instance().leer();			
			
		}
}
