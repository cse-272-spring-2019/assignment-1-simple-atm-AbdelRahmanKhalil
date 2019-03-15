/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;


/**
 *
 * @author Lenovo
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUI extends Application {
    //Stage Window;
    Scene scene;
    Button submit;
    public static void main(String[] args) {
       launch(args); 
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Window=primaryStage;
        primaryStage.setTitle("Login");
        
        Label passwordLabel =new Label("passnumber");
        TextField PasswordField =new PasswordField();
         submit =new Button("Submit");
        
        GridPane grid =new GridPane();
        grid.add(passwordLabel, 0, 0);
        grid.add(PasswordField, 0, 1);
        grid.add(passwordLabel, 0, 2);
        
        submit.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("hello");
            }
        });
        
         scene =new Scene(grid,300,250);
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }
    
}
