/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinalpateq13;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fomi0
 */
public class BusquedaPorTitulo extends BuscadorLibro{
    @Override
    public List<Libro> buscar(String criterio, String valor) {
        List<Libro> resultados = new ArrayList<>();
        /*
        Como esta clase es la buscadora por titulo, si el criterio es titulo
        buscará por el valor indicado
        */
        if (criterio.equalsIgnoreCase("titulo")) {
            /*
            Se iterará por cada elemento libro de tipo Libro, en la lista de
            libros obtenida de la instancia del gestor de libros
            */
            for (Libro libro : GestorLibros.getInstancia().getLibros()) {
                /*
                Si el autor del libro concuerda con el valor, se agrega al listado
                de resultados.
                */
                if (libro.getTitulo().toLowerCase().contains(valor.toLowerCase())) {
                    resultados.add(libro);
                }
            }
            //Una vez terminada la busqueda, se regresan los resultados
            return resultados;
        }
        /*
        Si hay una forma de buscar después de esta, se llamará su función de
        buscar, con el mismo criterio y valor, si ya no hay, se regresará null}
        */
        return (siguiente != null) ? siguiente.buscar(criterio, valor) : new ArrayList<>();
    }
}
