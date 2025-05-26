/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinalpateq13;

/**
 *
 * @author fomi0
 */
public class Enciclopedia extends Libro{
     public Enciclopedia(String isbn, String titulo, String autor, String anio, String genero) {
        super(isbn, "Enciclopedia", titulo, autor, anio, genero);
    }

    @Override
    public Libro obtenerInformacion() {
        System.out.println("Obteniendo información de Enciclopedia...");
        return this;
    }
}
