package com.jjtg.codigoLimpio.commandPattern.conPatron;

import com.jjtg.codigoLimpio.commandPattern.Producto;

public class GestorTareas {
	
	/*
	 * Este diseño nos permite tener una mayor flexibilidad ya que cada tarea es independiente. 
	 * El añadir nuevas tareas no afecta al resto de tareas. 
	 * Por otro lado es muy sencillo generar nuevas clases que por ejemplo agrupen tareas.
	 */
	
	public void ejecutar(Producto producto, TareaProducto tareaProducto) {
		
		tareaProducto.ejecutar(producto);
	}
	
//	public void validarProducto(Producto producto) {
//		 
//        if (producto.getPrecio() > 100) {
// 
//            System.out.println("producto valido");
//        } else {
// 
//            System.out.println("producto invalido");
//        }
//    }
// 
//    public void imprimirProducto(Producto producto) {
//         
//        System.out.println(producto.getNombre());
//        System.out.println(producto.getId());
//        System.out.println(producto.getPrecio());
//    }
//     
//    public void enviarPorCorreo(Producto producto) {
//         
//        System.out.println(producto.getNombre() +"enviado por correo") ;
//    }

}
