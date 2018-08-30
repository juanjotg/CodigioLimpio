package jjtg.codigoLimpio.singleton.bien;

public class GestorIO_NoPerezoso {

		private static GestorIO_NoPerezoso gestorIO = new GestorIO_NoPerezoso();	// necesario un atributo estático para guarda la instancia de la clase
	
		private GestorIO_NoPerezoso() {}
	
		public static GestorIO_NoPerezoso instance () { // necesario método estático (devuelve el singleton)
			
			return gestorIO;
			
		}
		
		public void escribir() {
			
			System.out.println("Estoy escribiendo");
			
		}
	
		public void leer() {
						
			System.out.println("Estoy leyendo");
			
		} 
		
		public void main(String[] args) {
						
			GestorIO_NoPerezoso.instance().escribir();
			GestorIO_NoPerezoso.instance().leer();			
			
		}
}
