package View;

import javax.swing.*;
import Controller.RegisterController;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;

public class RegisterForm extends JPanel {


    public Button cancelButton;
    public Button registerButton;
    public PasswordField passwordField;
    public PasswordField confirmPassword;
    public TextField usernameField;
    public TextField firstNameField;
    public TextField lastNameField;

    public RegisterForm(){



    }

    public String getUsername(){
        return usernameField.getText();
    }
    public String getPassword(){
        return passwordField.getText();
    }
    public String getConfirmPassword(){return passwordField.getText();}
    public String getFirstName(){ return firstNameField.getText();}
    public String getLastName(){return lastNameField.getText();}

    public void submitUserData(ActionEvent actionEvent) throws IOException {
        if(!getUsername().equals("") && !getPassword().equals("") && !getConfirmPassword().equals("")){
            if(getPassword().equals(getConfirmPassword())){
                if(RegisterController.submitUserData(getUsername(), getPassword(), getFirstName(), getLastName())){
                    //move to next page;
                }
            }
        }
        //alert user
    }

    public void reset(boolean bool){
        if(bool){
            usernameField.setText("");
            passwordField.setText("");
        }
    }

    public void cancelButtonHandler(ActionEvent actionEvent) {
    }

    public void registerButtonHandler(ActionEvent actionEvent) throws IOException {
        submitUserData(actionEvent);
    }
}