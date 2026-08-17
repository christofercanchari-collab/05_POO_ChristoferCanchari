package vallegrande.edu.pe.model;

public class Estudiante {
    //Atributos
    private int id;
    private String nombre;
    private String carrera;

    //Constructor
    public Estudiante(int id, String nombre, String carrera){
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    //GETTERS
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCarrera(){
        return carrera;
    }

    //MOSTRAR ESTUDIANTE
    public void mostrarEstudiante(){
        System.out.println("ID: "+id);
        System.out.println("Nombre del Estudiante: "+nombre);
        System.out.println("Carrera: "+ carrera);
        System.out.println("----------------------------------------");
    }
}
