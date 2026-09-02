package vallegrande.edu.pe.miperfil.model;

public class Perfil {
    private String nombre;
    private String carrera;
    private String semestre;
    private String hobby;

    public Perfil(String nombre, String carrera, String semestre, String hobby) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
        this.hobby = hobby;
    }

    public String obtenerPresentacion() {
        return "¡Hola! Mi nombre es " + nombre + ".\n" +
                "Estudio la carrera de " + carrera + " en el " + semestre + " semestre.\n" +
                "Mi hobby favorito es: " + hobby + ".";
    }
}
