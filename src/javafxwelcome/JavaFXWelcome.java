/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxwelcome;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author 86132113568
 */
public class JavaFXWelcome extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome!");

        // Container dos controles, será um grid de linhas e colunas centralizado
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);

        // Preenchimento interno
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Os controles
        Label titulo = new Label("Welcome");
        titulo.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(titulo, 0, 0, 2, 1);

        Label usuario = new Label("User name:");
        grid.add(usuario, 0, 1);

        TextField nomeUsuario = new TextField();
        grid.add(nomeUsuario, 1, 1);

        Label senha = new Label("Password:");
        grid.add(senha, 0, 2);

        PasswordField senhaUsuario = new PasswordField();
        grid.add(senhaUsuario, 1, 2);

        Button btnLogin = new Button("Login");

        HBox alinhamento = new HBox();
        alinhamento.setAlignment(Pos.BOTTOM_RIGHT);
        alinhamento.getChildren().add(btnLogin);

        grid.add(btnLogin, 1, 4);

        final Text lblMensagem = new Text();
        grid.add(lblMensagem, 1, 6);

        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                lblMensagem.setFill(Color.FIREBRICK);
                lblMensagem.setText("Sign in button pressed");
            }
        });

        grid.setGridLinesVisible(false);

        Scene cena = new Scene(grid, 300, 275);
        cena.getStylesheets().add(JavaFXWelcome.class.getResource("javafxwelcome.css").toExternalForm());
        primaryStage.setScene(cena);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
