package vallegrande.edu.pe.view;

public class BibliotecaView {
    //TITULO
    public void mostrarTitulo(){
        System.out.println("=================");
        System.out.println("SISTEMA DE BIBLIOTECA VG");
        System.out.println("=================");
    }
    //MENU
    public void mostrarMenu(){
        System.out.println("1. Registrar Libro");
        System.out.println("2. Listar Libros");
        System.out.println("3. Buscar Libro");
        System.out.println("4. Registrar Autor Nuevo");
        System.out.println("5. Listar Autores");
        System.out.println("6. Registrar Estudiante");
        System.out.println("7. Listar Estudiantes");
        System.out.println("8. Salir");
        System.out.println("Seleccione una opción");
    }
    //MENSAJE
    public void mostrarMensaje( String mensaje){
        System.out.println(mensaje);
    }
}