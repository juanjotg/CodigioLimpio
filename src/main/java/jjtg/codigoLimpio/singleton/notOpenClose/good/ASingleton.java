package jjtg.codigoLimpio.singleton.notOpenClose.good;

public class ASingleton extends Singleton {

	
	protected ASingleton(){
		super();
	}
	
	public void m() {
		System.out.println("Ejecuci�n de m de ASingleton");
	}
}
