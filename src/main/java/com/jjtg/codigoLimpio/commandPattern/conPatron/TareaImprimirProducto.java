package com.jjtg.codigoLimpio.commandPattern.conPatron;

import com.jjtg.codigoLimpio.commandPattern.Producto;

public class TareaImprimirProducto implements TareaProducto {

	@Override
	public void ejecutar(Producto producto) {
		
		System.out.println(producto.getNombre());
        System.out.println(producto.getId());
        System.out.println(producto.getPrecio());
		
	}

}
