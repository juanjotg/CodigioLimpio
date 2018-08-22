package com.jjtg.codigoLimpio.composite;

public abstract class ComponenteRecambio
{
	
	// Atributos
    private String nombre;
    private String descripcion;
    private double precio;
    
 
    //region Métodos exclusivos de los objetos compuestos
 
    public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void add(ComponenteRecambio componente) throws Exception
    {
        throw new Exception("add()");
    }
 
    public void remove(ComponenteRecambio componente) throws Exception
    {
        throw new Exception("remove()");
    }
 
    public ComponenteRecambio getElemento(int indice) throws Exception
    {
        throw new Exception("getElemento()");
    }
 
    //endregion
}