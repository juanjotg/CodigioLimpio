package com.jjtg.codigoLimpio.commandPattern.sinPatron;

import com.jjtg.codigoLimpio.commandPattern.Producto;

public class GestorProductos {
	
	/**
	 * Los problemas surgen cuando no hay solo tres tareas que ejecutar , sino que el número de tareas crece de forma exponencial sobre 
	 * la clase producto
	 */
	
	public void validarProducto(Producto producto) {
		 
        if (producto.getPrecio() > 100) {
 
            System.out.println("producto valido");
        } else {
 
            System.out.println("producto invalido");
        }
    }
 
    public void imprimirProducto(Producto producto) {
         
        System.out.println(producto.getNombre());
        System.out.println(producto.getId());
        System.out.println(producto.getPrecio());
    }
     
    public void enviarPorCorreo(Producto producto) {
         
        System.out.println(producto.getNombre() +"enviado por correo") ;
    }

}
