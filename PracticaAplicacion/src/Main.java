import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contacto> agenda = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- AGENDA DE CONTACTOS ---");
            System.out.println("1. Registrar contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese email: ");
                    String email = scanner.nextLine();
                    agenda.add(new Contacto(nombre, telefono, email));
                    System.out.println("¡Contacto registrado exitosamente!");
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE CONTACTOS ---");
                    if (agenda.isEmpty()) {
                        System.out.println("La agenda está vacía.");
                    } else {
                        for (Contacto c : agenda) {
                            c.mostrarContacto();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el nombre a buscar: ");
                    String busqueda = scanner.nextLine();
                    boolean encontrado = false;
                    for (Contacto c : agenda) {
                        if (c.getNombre().equalsIgnoreCase(busqueda)) {
                            System.out.println("Contacto encontrado:");
                            c.mostrarContacto();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo de la aplicación...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}