package vallegrande.edu.pe.app;

import vallegrande.edu.pe.controller.AgendaController;
import vallegrande.edu.pe.model.Contacto;
import vallegrande.edu.pe.view.AgendaView;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crear los componentes
        AgendaController controller = new AgendaController();
        AgendaView view = new AgendaView();
        Scanner scanner = new Scanner(System.in);

        // --- CONTACTOS DE PRUEBA PRECARGADOS ---
        Contacto contacto1 = new Contacto(1, "Chris", "Canchari", "Cañete", "922543293", "chris@gmail.com");
        Contacto contacto2 = new Contacto(2, "Davis", "Luyo", "Cañete", "931343771", "davis@gmail.com");
        Contacto contacto3 = new Contacto(3, "Maria", "Flores", "Lima", "912345678", "maria.flores@gmail.com");
        Contacto contacto4 = new Contacto(4, "Juan", "Perez", "Chincha", "987654321", "juan.perez@gmail.com");
        Contacto contacto5 = new Contacto(5, "Ana", "Gomez", "Ica", "954123678", "ana.gomez@gmail.com");

        controller.agregarContacto(contacto1);
        controller.agregarContacto(contacto2);
        controller.agregarContacto(contacto3);
        controller.agregarContacto(contacto4);
        controller.agregarContacto(contacto5);

        // El contador empieza en 6 para los nuevos contactos que registre el usuario
        int contadorId = 6;

        //Mostrar Información
        view.mostrarTitulo();
        int opcion = 0;

        do {
            view.mostrarMenu();
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    System.out.println("\n--- REGISTRAR CONTACTO ---");
                    System.out.print("Nombres: ");
                    String nombres = scanner.nextLine();
                    System.out.print("Apellidos: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Correo: ");
                    String correo = scanner.nextLine();

                    Contacto nuevo = new Contacto(contadorId++, nombres, apellidos, direccion, telefono, correo);
                    controller.agregarContacto(nuevo);
                    break;

                case 2:
                    controller.listarContactos();
                    break;

                case 3:
                    System.out.println("\n--- BUSCAR CONTACTO ---");
                    System.out.print("Ingrese el nombre o apellido a buscar: ");
                    String criterio = scanner.nextLine();
                    controller.buscarContacto(criterio);
                    break;

                case 4:
                    System.out.println("\n--- ELIMINAR CONTACTO ---");
                    System.out.print("Ingrese el ID del contacto a eliminar: ");
                    try {
                        int id = Integer.parseInt(scanner.nextLine());
                        controller.eliminarContacto(id);
                    } catch (NumberFormatException e) {
                        view.mostrarMensaje("ID no válido.");
                    }
                    break;

                case 5:
                    view.mostrarMensaje("¡Saliendo del sistema!");
                    break;

                default:
                    view.mostrarMensaje("Opción no válida. Ingrese un número del 1 al 5.");
                    break;
            }
        } while (opcion != 5);
        scanner.close();
    }
}