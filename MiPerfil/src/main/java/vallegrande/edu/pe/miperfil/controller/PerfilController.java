package vallegrande.edu.pe.miperfil.controller;

import vallegrande.edu.pe.miperfil.model.Perfil;
import vallegrande.edu.pe.miperfil.view.PerfilView;

public class PerfilController {
    private PerfilView view;

    public PerfilController(PerfilView view) {
        this.view = view;

        this.view.getBtnMostrar().setOnAction(e -> mostrarPerfil());
        this.view.getBtnLimpiar().setOnAction(e -> limpiarCampos());
    }

    private void mostrarPerfil() {
        String nombre = view.getTxtNombre().getText().trim();
        String carrera = view.getTxtCarrera().getText().trim();
        String semestre = view.getTxtSemestre().getText().trim();
        String hobby = view.getCbHobby().getValue();

        // Nivel 2: Validación de campo vacío
        if (nombre.isEmpty()) {
            view.getLblResultado().setText(" Error: El campo Nombre no puede estar vacío.");
            return;
        }

        if (hobby == null) {
            hobby = "No especificado";
        }

        Perfil perfil = new Perfil(nombre, carrera, semestre, hobby);
        view.getLblResultado().setText(perfil.obtenerPresentacion());
    }

    // Nivel 1: Método para limpiar campos
    private void limpiarCampos() {
        view.getTxtNombre().clear();
        view.getTxtCarrera().clear();
        view.getTxtSemestre().clear();
        view.getCbHobby().setValue(null);
        view.getLblResultado().setText("");
    }
}