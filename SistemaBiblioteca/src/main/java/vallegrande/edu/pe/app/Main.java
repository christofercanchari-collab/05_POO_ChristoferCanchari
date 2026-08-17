package vallegrande.edu.pe.app;

import vallegrande.edu.pe.controller.BibliotecaController;
import vallegrande.edu.pe.model.Libro;
import vallegrande.edu.pe.model.Autor;
import vallegrande.edu.pe.model.Estudiante;
import vallegrande.edu.pe.view.BibliotecaView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BibliotecaController controller = new BibliotecaController();
        BibliotecaView view = new BibliotecaView();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            view.mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("ID:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Titulo:");
                    String titulo = scanner.nextLine();
                    System.out.println("Autor:");
                    String autor = scanner.nextLine();
                    System.out.println("Año:");
                    int anio = scanner.nextInt();
                    scanner.nextLine();

                    //Validar datos
                    if (titulo.isEmpty() || autor.isEmpty() || anio <= 0) {
                        System.out.println("Datps no validos");
                    } else {
                        Libro libro = new Libro(id, titulo, autor, anio);
                        controller.agregarLibro(libro);
                    }
                    break;
                case 2:
                    controller.listarLibros();
                    break;
                case 3:
                    System.out.println("Ingrese Titulo o Autor");
                    String criterio = scanner.nextLine();
                    controller.buscarLibro(criterio);
                    break;
                case 4:
                    System.out.println("ID del Autor:");
                    int idAutor = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nombre del Autor:");
                    String nombreAutor = scanner.nextLine();
                    System.out.println("Nacionalidad:");
                    String nacionalidad = scanner.nextLine();

                    //Validación obligatoria para evitar registrar sin nombre
                    if (nombreAutor.trim().isEmpty()) {
                        System.out.println("Error: El nombre del autor no puede estar vacío.");
                    } else {
                        Autor nuevoAutor = new Autor(idAutor, nombreAutor, nacionalidad);
                        controller.agregarAutor(nuevoAutor);
                    }
                    break;
                case 5:
                    controller.listarAutores();
                    break;
                case 6:
                    System.out.println("ID del estudiante: ");
                    int idEstudiante = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nombre del Estudiante: ");
                    String nombreEstudiante = scanner.nextLine();
                    System.out.println("Carrera del Estudiante: ");
                    String carrera = scanner.nextLine();

                    //Validación para registro de nombre
                    if (nombreEstudiante.trim().isEmpty()) {
                        System.out.println("Error: El nombre del estudiante no puede estar vacío.");
                    } else {
                        Estudiante nuevoEstudiante = new Estudiante(idEstudiante, nombreEstudiante, carrera);
                        controller.agregarEstudiante(nuevoEstudiante);
                    }
                case 7:
                    controller.listarEstudiantes();
                    break;
                case 8:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 8); // Modificado para que salga con el número 6

        scanner.close();
    }
}