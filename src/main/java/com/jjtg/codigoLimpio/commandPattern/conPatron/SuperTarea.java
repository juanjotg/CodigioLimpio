package com.jjtg.codigoLimpio.commandPattern.conPatron;

import java.util.ArrayList;
import java.util.List;

import com.jjtg.codigoLimpio.commandPattern.Producto;

public class SuperTarea implements TareaProducto {

	private List<TareaProducto> lista= new ArrayList<TareaProducto>();
	
	public void addTarea(TareaProducto tareaProducto) {
		
		lista.add(tareaProducto);
		
	}
		
	@Override
	public void ejecutar(Producto producto) {

		lista.forEach((t)->t.ejecutar(producto));
		
	}

}
