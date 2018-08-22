package com.jjtg.codigoLimpio.composite;

public class ElementoRecambio extends ComponenteRecambio
{
   
 
    // Constructor
    public ElementoRecambio(String nombre, String descripcion, double precio)
    {
        setNombre(nombre);
        setDescripcion(descripcion);
        setPrecio(precio);
    }
 
    // Sobrecargamos únicamente los métodos propios de los nodos hoja, destinados
    // a devolver la información y a asignarla
 
        // Los métodos add, remove y getElemento no se sobrecargarán, ya que
    // el nodo hoja no estará compuesto por más elementos que él mismo.
    // Por tanto, si se invocan estos métodos, se llamará el método padre
    // que lanzará una excepción de tipo NotSupportedException
}
