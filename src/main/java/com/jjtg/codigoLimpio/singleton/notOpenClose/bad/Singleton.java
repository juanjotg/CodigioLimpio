package jjtg.codigoLimpio.singleton.notOpenClose.bad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class Singleton {

	private static Singleton singleton;

	public static Singleton instance() {
		
		/**
		 * Principio open close: si hay cambio de requisitos el código está abierto a añadir nuevos método o nuevas clases pero está cerrado a modifcar métodos que ya existian.
		 * Este método lo incumple ya que si hubiera una tercer tipo de configuración tendríamos que añadir un "else if" más.
		 */
		
		/**
		 * Principio de sustitución de Liskov: Nos dice como tenemos que hacer las herencias y nos dice que la clase padre no puede conocer a las clases hijas.
		 * Aquí tb está mal ya que se está llamado a ASingleton y BSingleton
		 */
		
		
		if (singleton == null) {
			String line = Singleton.getSingletonConfigure();
			if (line.equals("ASingleton")) {
				singleton = new ASingleton();
			} else if (line.equals("BSingleton")) {
				singleton = new BSingleton();
			} else { 
				assert false;
			}
		}
		return singleton;
	}

	private static String getSingletonConfigure() {
		
		BufferedReader in = null;
		String line = "";
		try {
			in = new BufferedReader(new FileReader("C:\\Proyectos\\CodigioLimpio\\src\\main\\java\\jjtg\\codigoLimpio\\singleton\\notOpenClose\\v1\\singletonConfigure"));
			line = in.readLine().substring(13);
		} catch (IOException ex) {
			System.out.println("IOException al leer: " + ex.getMessage());
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ex) {
					System.out.println("IOException al cerrar: "
							+ ex.getMessage());
				}
			}
		}
		return line;
	}


	protected Singleton() {

	}

	public void m() {
		System.out.println("Ejecuci�n de m de Singleton");
	}
}
