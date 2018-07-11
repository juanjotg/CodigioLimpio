package com.jjtg.codigoLimpio.commandPattern.conPatron;

import com.jjtg.codigoLimpio.commandPattern.Producto;

public class TareaValidarProducto implements TareaProducto {

	@Override
	public void ejecutar(Producto producto) {
		
		if (producto.getPrecio() > 100) {
			 
            System.out.println("producto valido");
        } else {
 
            System.out.println("producto invalido");
        }
		
	}

}
