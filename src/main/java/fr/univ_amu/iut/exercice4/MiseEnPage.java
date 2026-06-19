package fr.univ_amu.iut.exercice4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MiseEnPage extends Application {

  @Override
  public void start(Stage primaryStage) {
    BorderPane root = new BorderPane();

    // MenuBar en haut
    MenuBar menuBar = new MenuBar();
    Menu menuFichier = new Menu("Fichier");
    Menu menuAide = new Menu("Aide");
    menuBar.getMenus().addAll(menuFichier, menuAide);
    root.setTop(menuBar);

    // GridPane au centre
    GridPane gridPane = new GridPane();
    gridPane.setHgap(10);
    gridPane.setVgap(10);
    gridPane.setPadding(new Insets(20));

    Label labelNom = new Label("Nom :");
    Label labelEmail = new Label("Email :");
    TextField champNom = new TextField();
    TextField champEmail = new TextField();

    gridPane.add(labelNom, 0, 0);
    gridPane.add(champNom, 1, 0);
    gridPane.add(labelEmail, 0, 1);
    gridPane.add(champEmail, 1, 1);

    root.setCenter(gridPane);

    // HBox en bas
    HBox hbox = new HBox(10);
    hbox.setPadding(new Insets(15));

    Button boutonValider = new Button("Valider");
    boutonValider.setPrefWidth(110);
    boutonValider.setStyle(
        "-fx-background-color: #4a90d9; -fx-text-fill: white; -fx-font-weight: bold;");

    Button boutonAnnuler = new Button("Annuler");
    boutonAnnuler.setPrefWidth(110);
    boutonAnnuler.setStyle(
        "-fx-background-color: #cccccc; -fx-text-fill: #333333; -fx-border-color: #aaaaaa;");

    hbox.getChildren().addAll(boutonValider, boutonAnnuler);
    root.setBottom(hbox);

    Scene scene = new Scene(root, 450, 300);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
