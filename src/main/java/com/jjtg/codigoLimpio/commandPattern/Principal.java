package com.jjtg.codigoLimpio.commandPattern;

import com.jjtg.codigoLimpio.commandPattern.conPatron.GestorTareas;
import com.jjtg.codigoLimpio.commandPattern.conPatron.SuperTarea;
import com.jjtg.codigoLimpio.commandPattern.conPatron.TareaEnviarPorCorreo;
import com.jjtg.codigoLimpio.commandPattern.conPatron.TareaImprimirProducto;
import com.jjtg.codigoLimpio.commandPattern.conPatron.TareaValidarProducto;
import com.jjtg.codigoLimpio.commandPattern.sinPatron.GestorProductos;

public class Principal {

	public static void main(String[] args) {
		
		sinPatron();
		
		System.out.println("---------");
		
		conPatron1();
		
		System.out.println("---------");
		
		conPatron2();
		

	}
	
	public static void sinPatron() {
		
		GestorProductos gestorProductos = new GestorProductos();
		
		Producto producto = new Producto(1,"tablet",100);
		
		gestorProductos.enviarPorCorreo(producto);
		gestorProductos.imprimirProducto(producto);
		gestorProductos.validarProducto(producto);
		
	}
	
	public static void conPatron1() {
		
		GestorTareas gestorTareas = new GestorTareas();
		
		Producto producto = new Producto(1,"tablet",100);
						
		gestorTareas.ejecutar(producto, new TareaValidarProducto());
		
		gestorTareas.ejecutar(producto, new TareaImprimirProducto());
		
		gestorTareas.ejecutar(producto, new TareaEnviarPorCorreo());
	
		
	}
	
	public static void conPatron2() {
		
		SuperTarea superTarea = new SuperTarea();
				
		superTarea.addTarea(new TareaValidarProducto());
		superTarea.addTarea(new TareaImprimirProducto());
		superTarea.addTarea(new TareaEnviarPorCorreo());
		
		Producto producto = new Producto(1,"tablet",100);
				
		GestorTareas gestorProductosConPatron = new GestorTareas();		
		gestorProductosConPatron.ejecutar(producto, superTarea);
		
	}

}
