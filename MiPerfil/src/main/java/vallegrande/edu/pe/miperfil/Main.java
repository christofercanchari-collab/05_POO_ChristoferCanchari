package vallegrande.edu.pe.miperfil;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vallegrande.edu.pe.miperfil.controller.PerfilController;
import vallegrande.edu.pe.miperfil.view.PerfilView;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        PerfilView view = new PerfilView();
        new PerfilController(view);

        // Aumentamos el tamaño a 400x500 para dar espacio a la interfaz
        Scene scene = new Scene(view.getContenedor(), 400, 500);

        // Cargar hoja de estilos CSS (Nivel 4)
        String css = getClass().getResource("/styles.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setTitle("Mi Perfil");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}