/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinalpateq13;

/**
 *
 * @author fomi0
 */

public class CreadorDeLibros {

    //Método para crear libros, obtiene la información del libro
    public static Libro crearLibro(String isbn, String tipo, String titulo, String autor, String anio, String genero) {
        
        //Dependiendo del tipo, crea un objeto Novela o Enciclopedia
        switch (tipo.toLowerCase()) {
            case "novela" -> {
                return new Novela(isbn, titulo, autor, anio, genero);
            }
            case "enciclopedia" -> {
                return new Enciclopedia(isbn, titulo, autor, anio, genero);
            }
            default -> throw new IllegalArgumentException("Tipo de libro no reconocido.");
        }
    }
}
