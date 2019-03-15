/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import javafx.application.Application;
import static javafx.application.Application.launch;
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

import javafx.stage.Stage;

/**
 *
 * @author Lenovo
 */
public class TestingGUI extends Application {
    BankAccount User1=new BankAccount("mohammed",0,5797); //MADE PUBLIC
    History history= new History(User1);
    Transaction transaction=new Transaction(User1.getBalance());
    float BalanceBefore,BalanceAfter;
    //int i=0;
    
    PasswordValidation validate =new PasswordValidation("5797");
    InputBox inputBox=new InputBox();
    Button submit,button,button1,button2,button3,button4,buttton5,inquiry;
    Label label,label1,label2,label3;
    static Label feedback=new Label();
    Stage window,account;
    Scene Scene1,Scene2;
    String MainLabel,Feedback;
    
    public static void setLabel(String TextinFeedbackLabel)                         //public static to work in other classes
    {
        
        feedback.setText(TextinFeedbackLabel);                                      
    }
   
    public static void main(String[] args) {
       launch(args); 
    }

    
    public void start(Stage primaryStage) throws Exception {
        //  history.setJ(0);
        window= primaryStage;
        //account=primaryStage;
        window.setTitle("Login");
        //account.setTitle("Main Menue");
        
        Label passwordLabel =new Label("Enter Pass number");
        TextField PasswordField =new PasswordField();
        submit =new Button("SUBMIT");
        label = new Label("Welcome to your account!");
        //setLabel();
        
        //label1=new Label("hiiiii");
        //label2=new Label("BYEEE");
        
        submit.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String passnum =PasswordField.getText();
                boolean valid = validate.Validate(passnum);
                if(valid)
                {window.setScene(Scene2);
                    window.setTitle("Main Menue");}
                else
                    AlertBox.display("ALERT", "WRONG PASSWORD");
                    
            }
        });
        
        button=new Button("CLICK ME");
        button.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                AlertBox.display("ALERT", "YOU CLICKED ME");
            }
        });
        
        
        
        //need to make buttons of scene 2
        
         
         
         
        StackPane test =new StackPane();
        
        GridPane layout1 =new GridPane();
        layout1.setAlignment(Pos.CENTER);
        layout1.setVgap(10);
        layout1.setHgap(10);
        layout1.setMinSize(400, 200);
        layout1.setPadding(new Insets(10, 10, 10, 10));
        layout1.add(passwordLabel,3,1);
        layout1.add(PasswordField, 3, 4);
        layout1.add(button, 3, 10);
         layout1.add(submit, 3, 8);
        //layout.getChildren().add(PasswordField);
         Scene1 =new Scene(layout1,300,300);
        window.setScene(Scene1);
        
        GridPane layout2=new GridPane();
        button1=new Button("Deposit");                                              //deposit
        button1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                User1=inputBox.getInput(User1,1);
                System.out.println("I executed after inputbox");
                
                //if(BalanceBefore!=BalanceAfter)
                         //{  
                            // history.save(i, "Deposit", BalanceAfter-BalanceBefore);
                             //i++} 
                //if(inputBox.SubmitFlag){
                  
                  //feedback.setText("Deposit of "+transaction.getValue()+" successful");
                //}
            }
        });
        
        
        
        
        
        inquiry=new Button("Balance inquiry");
        inquiry.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                feedback.setText("Balance="+Float.toString(User1.getBalance()));
                User1.save("Balance Inquiry:", User1.getBalance());
                User1.setJ(User1.getI()-1);
            }
        });
        
        
        button2=new Button("Withdraw");
        button2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                User1=inputBox.getInput(User1,2);
                
                
                //if(BalanceBefore!=BalanceAfter)
                //         {history.save(i, "Withdraw", BalanceBefore-BalanceAfter);
                  //           i++;} 
            }
        });
        
        button3=new Button("Next");
        button3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                User1.next();
            }
        });
        button4=new Button("Previous");
        button4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                User1.previous();
            }
        });
        label1=new Label(MainLabel);
        //feedback=new Label(Feedback);
        
        
        //button1=new Button("Deposit");
        
        layout2.add(label, 0, 0);
        layout2.add(feedback, 0, 4);
        layout2.add(button1, 0, 1);
        layout2.add(button2, 1, 1);
        layout2.add(button3, 0, 2);
        layout2.add(button4, 1, 2);
        layout2.add(inquiry, 0, 3);
        button1.setMinSize(layout2.getPrefWidth(), 8);
        button2.setMinSize(layout2.getPrefWidth(), 8);
        button3.setMinSize(layout2.getPrefWidth(), 8);
        button4.setMinSize(layout2.getPrefWidth(), 8);
        inquiry.setMinSize(layout2.getPrefWidth(), 8);
        layout2.setMinSize(300, 200);
        layout2.setVgap(3);
        layout2.setHgap(3);
        
        //layout2.add(label, 2, 1);
        //layout2.setAlignment(Pos.CENTER);
        layout2.add(label1,3,4);
        //layout2.add(label2,0,9);
        
        Scene2=new Scene(layout2,300,300);
        window.show();
        //account.show();
    }

    
    
}
