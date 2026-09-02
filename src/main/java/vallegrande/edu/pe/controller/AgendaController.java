package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Contacto;
import java.util.ArrayList;

public class AgendaController {
    //Lista Contactos
    private ArrayList<Contacto> contactos;

    //Constructor
    public AgendaController() {
        contactos = new ArrayList<>();
    }

    //Agregar Contactos
    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
        System.out.println("Contacto Agregado corractamente");
    }

    //Listar Contactos
    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos registrados.");
            return;
        }
        System.out.println("LISTA DE CONTACTOS");
        for (Contacto contacto : contactos) {
            contacto.mostrarContacto();
        }
    }
    //Buscar Contactos
    public void buscarContacto(String criterio){
        boolean encontrado = false;
        String texto = criterio.toLowerCase();
        for (Contacto contacto : contactos){
            if (contacto.getNombres().toLowerCase().contains(texto) ||
                contacto.getApellidos().toLowerCase().contains(texto)){
                contacto.mostrarContacto();
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("No se encontraron contactos con término: " + criterio);
        }
    }
    public void eliminarContacto(int id){
        boolean eliminado = contactos.removeIf(c -> c.getId() == id);
        if (eliminado){
            System.out.println("Contacto con ID" + id + "eliminado correctamente");
        }else{
            System.out.println("No se encontró con mingún contacto con el ID" + id);
        }
    }
}
