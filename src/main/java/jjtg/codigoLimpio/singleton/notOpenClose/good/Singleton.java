package jjtg.codigoLimpio.singleton.notOpenClose.good;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class Singleton {

	private static Singleton singleton;

	public static Singleton instance() {
		
		if (singleton == null) {
			
			String line = Singleton.getSingletonConfigure();
				
			try {
				
				// esto se llama reflexion
				singleton = (Singleton) (Class.forName("jjtg.codigoLimpio.singleton.notOpenClose.good." + line).newInstance());
			} catch (InstantiationException e) {
				assert false;
			} catch (IllegalAccessException e) {
				assert false;
			} catch (ClassNotFoundException e) {
				assert false;
			}
		}
		return singleton;
	}

	private static String getSingletonConfigure() {
		
		BufferedReader in = null;
		String line = "";
		try {
			in = new BufferedReader(new FileReader("C:\\Proyectos\\CodigioLimpio\\src\\main\\java\\jjtg\\codigoLimpio\\singleton\\notOpenClose\\good\\singletonConfigure"));
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
