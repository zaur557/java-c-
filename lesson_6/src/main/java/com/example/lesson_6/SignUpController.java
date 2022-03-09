package com.example.lesson_6;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private CheckBox signUpCheckBoxFemale;

    @FXML
    private CheckBox signUpCheckBoxMale;

    @FXML
    private TextField signUpCountry;

    @FXML
    private TextField signUpLastName;

    @FXML
    private TextField signUpName;

    @FXML
    private Button singUpButton;

    @FXML
    void initialize() {
        assert login_field != null : "fx:id=\"login_field\" was not injected: check your FXML file 'signUp.fxml'.";
        assert password_field != null : "fx:id=\"password_field\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpCheckBoxFemale != null : "fx:id=\"signUpCheckBoxFemale\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpCheckBoxMale != null : "fx:id=\"signUpCheckBoxMale\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpCountry != null : "fx:id=\"signUpCountry\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpLastName != null : "fx:id=\"signUpLastName\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpName != null : "fx:id=\"signUpName\" was not injected: check your FXML file 'signUp.fxml'.";
        assert singUpButton != null : "fx:id=\"singUpButton\" was not injected: check your FXML file 'signUp.fxml'.";

    }

}
