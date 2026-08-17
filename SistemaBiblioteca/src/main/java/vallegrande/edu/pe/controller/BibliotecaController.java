package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Libro;
import vallegrande.edu.pe.model.Autor;
import vallegrande.edu.pe.model.Estudiante;

import java.awt.*;
import java.util.ArrayList;
import java.util.Locale;

public class BibliotecaController {

    //Lista donden almacenaremos nuestros libros
    private ArrayList<Libro> libros;
    private ArrayList<Autor> autores;
    private ArrayList<Estudiante> estudiantes;

    //Constructor
    public BibliotecaController(){
        libros = new ArrayList<>();
        autores = new ArrayList<>();
        estudiantes = new ArrayList<>();
    }

    //Registrar
    public void agregarLibro(Libro libro){
        libros.add(libro);
        System.out.println("Libro registrado correctamente");
    }

    //Listar
    public void listarLibros(){
        if(libros.isEmpty()){
            System.out.println("No hay libros registrados");
            return;
        }
        System.out.println("LISTA DE LIBROS");
        for ( Libro libro: libros){
            libro.mostrarLibro();
        }
    }
    //Buscar
    public void buscarLibro(String criterio){
        boolean encontrado = false;
        String texto = criterio.toLowerCase();
        for ( Libro libro: libros){
            if(libro.getTitulo().toLowerCase().contains(texto) ||
                    libro.getAutor().toLowerCase().contains(texto)) {
                libro.mostrarLibro();
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("No se encontro ningun libro");
        }
    }
    // Agregar autor
    public void agregarAutor(Autor autor){
        autores.add(autor);
        System.out.println("Autor registrado correctamente");
    }

    //Listar autores
    public void listarAutores(){
        if(autores.isEmpty()){
            System.out.println("No hay autores registrados");
            return;
        }
        System.out.println("LISTA DE AUTORES");
        for (Autor autor : autores){
            autor.mostrarAutor();
        }
    }
    //Agregar Estudiante
    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
        System.out.println("Estudiante registrado exitosamente");
    }

    //Listar Estudiantes
    public void listarEstudiantes(){
        if(estudiantes.isEmpty()){
            System.out.println("No hay estudiantes registrados");
            return;
        }
        System.out.println("LISTA DE ESTUDIANTES");
        for (Estudiante estudiante : estudiantes){
            estudiante.mostrarEstudiante();
        }
    }
}