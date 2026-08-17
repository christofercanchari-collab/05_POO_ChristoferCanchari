package vallegrande.edu.pe.model;

public class Autor {
    // ATRIBUTOS
    private int id;
    private String nombre;
    private String nacionalidad;

    // CONSTRUCTOR
    public Autor(int id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // GETTERS
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }

    // MOSTRAR AUTOR
    public void mostrarAutor() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("------------------------------------");
    }
}