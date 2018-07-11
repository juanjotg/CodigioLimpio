package com.jjtg.codigoLimpio.commandPattern.conPatron;

import com.jjtg.codigoLimpio.commandPattern.Producto;

public class TareaEnviarPorCorreo implements TareaProducto {

	@Override
	public void ejecutar(Producto producto) {
		
		System.out.println(producto.getNombre() +"enviado por correo") ;
		
	}

}
