package com.example.lesson_6;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button authSigInButton;

    @FXML
    private Button loginSignUpButton;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    void initialize() {
        assert authSigInButton != null : "fx:id=\"authSiginButton\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert loginSignUpButton != null : "fx:id=\"loginSignUpButton\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert login_field != null : "fx:id=\"login_field\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert password_field != null : "fx:id=\"password_field\" was not injected: check your FXML file 'hello-view.fxml'.";
        loginSignUpButton.setOnAction(event -> {
            loginSignUpButton.getScene().getWindow().hide();

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SignUp.fxml"));


            try {
                fxmlLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = fxmlLoader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

    }
 }


//    @FXML
//    void initialize() {
//        loginSignUpButton.setOnAction(event -> {
//            try {
//                handle(event);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        });
//    }
//
//    private void handle(ActionEvent event) throws IOException {
//        loginSignUpButton.getScene().getWindow().hide();
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(getClass().getResource("/main/resources/com.example.lesson_6./signUp.fxml"));
//        loader.load();
//
//        Parent root = loader.getRoot();
//        Stage stage = new Stage();
//        stage.setScene(new Scene(root));
//        stage.showAndWait();
//
//    }
//}

