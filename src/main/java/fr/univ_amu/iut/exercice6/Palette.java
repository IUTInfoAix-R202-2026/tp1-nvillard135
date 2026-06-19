package fr.univ_amu.iut.exercice6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Palette extends Application {

  private int compteurRouge = 0;
  private int compteurVert = 0;
  private int compteurBleu = 0;

  @Override
  public void start(Stage primaryStage) {
    BorderPane root = new BorderPane();

    // HBox avec les 3 boutons en haut
    HBox hbox = new HBox(10);
    hbox.setPadding(new Insets(15));
    hbox.setAlignment(Pos.CENTER);

    Button btnRouge = new Button("Rouge");
    btnRouge.setId("btn-rouge");
    btnRouge.setStyle(
        "-fx-background-color: #e74c3c; -fx-text-fill: white; "
            + "-fx-font-weight: bold; -fx-background-radius: 6;");

    Button btnVert = new Button("Vert");
    btnVert.setId("btn-vert");
    btnVert.setStyle(
        "-fx-background-color: #27ae60; -fx-text-fill: white; "
            + "-fx-font-weight: bold; -fx-background-radius: 6;");

    Button btnBleu = new Button("Bleu");
    btnBleu.setId("btn-bleu");
    btnBleu.setStyle(
        "-fx-background-color: #2980b9; -fx-text-fill: white; "
            + "-fx-font-weight: bold; -fx-background-radius: 6;");

    hbox.getChildren().addAll(btnRouge, btnVert, btnBleu);
    root.setTop(hbox);

    // Pane central (zone de couleur)
    Pane zone = new Pane();
    zone.setId("zone");
    zone.setMinSize(300, 200);
    root.setCenter(zone);

    // Label des compteurs en bas
    Label labelCompteurs = new Label("Rouge: 0 Vert: 0 Bleu: 0");
    labelCompteurs.setId("compteurs");
    labelCompteurs.setMaxWidth(Double.MAX_VALUE);
    labelCompteurs.setAlignment(Pos.CENTER);
    root.setBottom(labelCompteurs);

    // Écouteurs
    btnRouge.setOnAction(
        e -> {
          zone.setStyle("-fx-background-color: red;");
          compteurRouge++;
          labelCompteurs.setText(
              "Rouge: " + compteurRouge + " Vert: " + compteurVert + " Bleu: " + compteurBleu);
        });

    btnVert.setOnAction(
        e -> {
          zone.setStyle("-fx-background-color: green;");
          compteurVert++;
          labelCompteurs.setText(
              "Rouge: " + compteurRouge + " Vert: " + compteurVert + " Bleu: " + compteurBleu);
        });

    btnBleu.setOnAction(
        e -> {
          zone.setStyle("-fx-background-color: blue;");
          compteurBleu++;
          labelCompteurs.setText(
              "Rouge: " + compteurRouge + " Vert: " + compteurVert + " Bleu: " + compteurBleu);
        });

    Scene scene = new Scene(root, 450, 350);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
