/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinalpateq13;

/**
 *
 * @author fomi0
 */

//Novela es un tipo de LIBRO
public class Novela extends Libro{
    
    //Constructor de Novela
    public Novela(String isbn, String titulo, String autor, String anio, String genero) {
        super(isbn, "Novela", titulo, autor, anio, genero);
    }

    //Mostrar información regresa los datos de 
    @Override
    public Libro obtenerInformacion() {
        System.out.println("Obteniendo información de Novela...");
        return this;
    }
}
