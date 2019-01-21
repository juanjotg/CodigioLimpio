package com.jjtg.codigoLimpio.singleton.conRegistry;

public class ASingleton extends Singleton {

	protected ASingleton() {
		super();
		SingletonRegistry.instance().register("ASingleton", this);
	}

	public void m() {
		System.out.println("Ejecuci�n de m de ASingleton");
	}
	
	// necesario en Java por ejecuci�n de static en carga, no en C++
	public static void register() {
		new ASingleton();
	}
}
