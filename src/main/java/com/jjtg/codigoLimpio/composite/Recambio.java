package com.jjtg.codigoLimpio.composite;

import java.util.ArrayList;

public class Recambio extends ComponenteRecambio
{
    // Arraylist que contendrá los elementos hijo
    private ArrayList<ComponenteRecambio> listaRecambios;
 
 
 
    // Constructor que recibirá el nombre, el precio y la descripción.
    public Recambio(String nombre, String descripcion, double precio)
    {
        // Instanciamos el ArrayList
        listaRecambios = new ArrayList<ComponenteRecambio>();
 
        // Asignamos el nombre, la descripción y el precio
        setNombre(nombre);
        setDescripcion(descripcion);
        setPrecio(precio);
 
    }
 
    //region Métodos relacionados con el árbol
 
    // Añade un nuevo elemento al ArrayList
    @Override
    public void add(ComponenteRecambio componente)
    {
        listaRecambios.add(componente);
    }
 
    // Elimina un elemento del ArrayList
    @Override
    public void remove(ComponenteRecambio componente)
    {
        listaRecambios.remove(componente);
    }
 
    // Recupera un elemento del ArrayList
    @Override
    public ComponenteRecambio getElemento(int indice)
    {
        return (ComponenteRecambio)listaRecambios.get(indice);
    }
 
    @Override
    public String getNombre()
    {
        String nombreCompleto = getNombre() + "\n";
     
        for(ComponenteRecambio c : listaRecambios){
            nombreCompleto += c.getNombre();
        }    
     
        return nombreCompleto;
    }
     
    @Override
    public String getDescripcion()
    {
        String descripcionCompleta = getDescripcion() + "\n";
     
        for(ComponenteRecambio c : listaRecambios){
            descripcionCompleta += c.getDescripcion();
        }    
     
        return descripcionCompleta;
    }
     
    @Override
    public double getPrecio()
    {
        double precioTotal = super.getPrecio();
     
        for(ComponenteRecambio c : listaRecambios){
            precioTotal += c.getPrecio();
        }    
     
        return precioTotal;
    }
} 
