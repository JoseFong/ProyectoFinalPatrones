/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinalpateq13;

import java.util.ArrayList;
import java.util.List;

//Imports para leer y actualizar archivos
import java.io.*;

/**
 *
 * @author fomi0
 */

//El gestor de libros se encargará de guardar los libros en una lista y que solo exista esta única lista.
public class GestorLibros {
    //Solo existirá esta UNICA instancia del GestorDeLibros
    private static GestorLibros instancia;
    
    //Lista de libros
    private List<Libro> libros;
    
    //Constructor de la clase, solo inicializa la lista de Libros
    private GestorLibros(){
        libros = new ArrayList<>();
    }
    
    //Este método obtiene la instancia del gestor de libros
    //Si no existe una instancia la crea y la regresa
    //Si ya existe la instancia la regresa simplemente.
    public static GestorLibros getInstancia(){
        if(instancia==null){
            instancia = new GestorLibros();
        }
        return instancia;
    }
    
    //recibe un libro y lo agrega a la lista de libros
    public void agregarLibro(String isbn, String tipo, String titulo, String autor, String anio, String genero){
        //Se manda llamar a la fabrica de libros, la función crearLibro, pasando los parámetros.
        Libro libro = CreadorDeLibros.crearLibro(isbn, tipo, titulo, autor, anio, genero);
        libros.add(libro);
    }
    
    //Registra un libro en el archivo datos.txt
    public void agregarLibroAlArchivo(String isbn, String tipo, String titulo, String autor, String anio, String genero){
        //Se agrega la información del libro al archivo de texto
        String texto = isbn+";"+tipo+";"+titulo+";"+autor+";"+anio+";"+genero+"\n";
        String ruta = "datos/datos.txt";
        try(FileWriter escritor = new FileWriter(ruta,true)){
            System.out.println(new File("datos/datos.txt").getAbsolutePath());  
            escritor.write(texto);
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    //Obtiene todos los libros que existen en la colección
    public List<Libro> getLibros(){
        return libros;
    }
    
    //Lee y agrega al gestor de libros todos los archivos que están dentro del archivo datos.txt
    public void cargarLibrosDeArchivo(){
        //Se busca el archivo
        String ruta = "datos/datos.txt";
        File archivo = new File(ruta);
        
        try(BufferedReader lector = new BufferedReader(new FileReader(archivo))){
            String linea;
            while((linea=lector.readLine())!=null){
                String[] partes = linea.split(";");
                
                String isbn = partes[0];
                String tipo = partes[1];
                String titulo = partes[2];
                String autor = partes[3];
                String anio = partes[4];
                String genero = partes[5];
                
                //Se agrega un libro por cada renglón del archivo
                agregarLibro(isbn,tipo,titulo,autor,anio,genero);
            }
        }catch(IOException e){
            System.out.println("Error al leer el archivo.");
        }
    }
}
