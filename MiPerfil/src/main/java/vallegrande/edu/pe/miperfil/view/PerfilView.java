package vallegrande.edu.pe.miperfil.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import javafx.geometry.Insets;

import static java.awt.SystemColor.text;

public class PerfilView {
    private VBox contenedor;
    private TextField txtNombre;
    private TextField txtCarrera;
    private TextField txtSemestre;
    private ComboBox<String> cbHobby;
    private Button btnMostrar;
    private Button btnLimpiar;
    private Label lblResultado;

    public PerfilView() {
        Label titulo = new Label("MI PERFIL");

        txtNombre = new TextField();
        txtNombre.setPromptText("Ingrese su nombre completo");

        txtCarrera = new TextField();
        txtCarrera.setPromptText("Ingrese su carrera");

        txtSemestre = new TextField();
        txtSemestre.setPromptText("Ingrese su semestre");

        cbHobby = new ComboBox<>();
        cbHobby.getItems().addAll("Videojuegos", "Hobby / Pasatiempo", "Curso favorito", "Ciudad de origen", "Música");
        cbHobby.setPromptText("Seleccione un dato adicional");

        btnMostrar = new Button("Mostrar Perfil");
        btnLimpiar = new Button("Limpiar");

        lblResultado = new Label();

        contenedor = new VBox(10);
        contenedor.setPadding(new Insets(20));
        contenedor.setAlignment(Pos.CENTER);
        contenedor.getChildren().addAll(
                titulo, txtNombre, txtCarrera, txtSemestre, cbHobby, btnMostrar, btnLimpiar, lblResultado
        );
    }

    public VBox getContenedor() { return contenedor; }
    public TextField getTxtNombre() { return txtNombre; }
    public TextField getTxtCarrera() { return txtCarrera; }
    public TextField getTxtSemestre() { return txtSemestre; }
    public ComboBox<String> getCbHobby() { return cbHobby; }
    public Button getBtnMostrar() { return btnMostrar; }
    public Button getBtnLimpiar() { return btnLimpiar; }
    public Label getLblResultado() { return lblResultado; }
}