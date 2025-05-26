/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinalpateq13;

import java.util.List;

/**
 *
 * @author fomi0
 */

/*
    Clase para buscar un libro, esta es abstracta ya que existirán varias
    clases buscadoras (por título, por autor, etc) que hereden de esta
*/
public abstract class BuscadorLibro {
    /*
        Cada buscador tiene un buscador "siguiente" ya que si por ejemplo,
        el usuario busca por autor, el primer buscador que se ejecutará será 
        por nombre, y como no concuerda con el método de busqueda, irá al siguiente
        buscador, hasta llegar al buscador por autor.
    */
    protected BuscadorLibro siguiente;

    //Método para establecer cuál será la siguiente forma de buscar.
    public void setSiguiente(BuscadorLibro siguiente) {
        this.siguiente = siguiente;
    }

    //Función absctracta para buscar libros.
    public abstract List<Libro> buscar(String criterio, String valor);
}
