/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinalpateq13;

/**
 *
 * @author fomi0
 */

//Clase abstracta porque existirán diferentes tipos de libros
public abstract class Libro {
    //Atributos que puede tener cada uno de los libros 
    protected String isbn;
    protected String tipo;
    protected String titulo;
    protected String autor;
    protected String anio;
    protected String genero;
    
    //Constructor del objeto Libro, solo se crea el objeto.
    public Libro(String isbn, String tipo, String titulo, String autor, String anio, String genero){
        this.isbn = isbn;
        this.tipo = tipo;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.genero = genero;
    }
    
    
    //Funciones GET
    public String getTipo() { return tipo; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getISBN() { return isbn; }
    public String getGenero() { return genero; }
    public String getAnio() { return anio; }

    //Función abstracta para obtener la información
    public abstract Libro obtenerInformacion();
}
