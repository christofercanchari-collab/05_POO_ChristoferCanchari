public class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() { return nombre; }

    public void mostrarContacto() {
        System.out.println("Nombre: " + nombre + " | Teléfono: " + telefono + " | Email: " + email);
    }
}