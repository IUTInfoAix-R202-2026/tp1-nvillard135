package fr.univ_amu.iut.exercice5;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EvenementsBouton extends Application {

  @Override
  public void start(Stage primaryStage) {
    VBox root = new VBox(15);
    root.setAlignment(Pos.CENTER);

    Button bouton = new Button("Clique-moi");
    bouton.setId("bouton-clique-moi");
    bouton.setStyle(
        "-fx-background-color: #4a90d9; -fx-text-fill: white; "
            + "-fx-font-weight: bold; -fx-padding: 12 28;");

    Label labelCompteur = new Label("0 clics");
    labelCompteur.setId("compteur");
    labelCompteur.setStyle(
        "-fx-background-color: #f0f0f0; -fx-border-color: #cccccc; -fx-padding: 8 16;");

    Compteur compteur = new Compteur();

    bouton.setOnAction(
        e -> {
          compteur.incrementer();
          labelCompteur.setText(compteur.getValeur() + " clics");
        });

    root.getChildren().addAll(bouton, labelCompteur);

    Scene scene = new Scene(root, 300, 200);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
