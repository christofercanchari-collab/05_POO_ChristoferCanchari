package vallegrande.edu.pe.view;

public class AgendaView {
    //Mostrar Título
    public void mostrarTitulo(){
        System.out.println("--------------------");
        System.out.println("AGENDA CONTACTOS");
        System.out.println("--------------------");
    }
    public void mostrarMenu() {
        System.out.println("\n1. Registrar Contacto");
        System.out.println("2. Listar Contactos");
        System.out.println("3. Buscar Contacto");
        System.out.println("4. Eliminar Contacto");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }
    //Mostar Mensaje
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
