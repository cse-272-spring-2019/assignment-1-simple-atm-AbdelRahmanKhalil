/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;

/**
 *
 * @author Lenovo
 */
public class InputBox {
    //BankAccount User1=new BankAccount("mohammed",0,5797);
    
    // TestingGUI guiobj=new TestingGUI();
    float BalanceBefore,BalanceAfter;
    static Boolean SubmitFlag=false;
    static Boolean CancelFlag=false;
    static float floatInput;
    
    
    public  BankAccount getInput(BankAccount dummy,int typeOfTransaction){
       Transaction transaction=new Transaction(dummy.getBalance()); 
        Button b0=new Button("0");
    Button b1=new Button("1");
    Button b2=new Button("2");
    Button b3=new Button("3");
    Button b4=new Button("4");
    Button b5=new Button("5");
    Button b6=new Button("6");
    Button b7=new Button("7");
    Button b8=new Button("8");
    Button b9=new Button("9");
    Button bPoint=new Button(".");
    Button bSubmit=new Button("Submit");
    Button clear=new Button("Clear");
        Stage window=new Stage(); 
      window.initModality(Modality.APPLICATION_MODAL);  //doesn't allow you to do anything else but work with this allert box
      window.setTitle("Input Window");
      //window.setMinWidth(500);
      
      Label label=new Label();
      label.setText("Enter value of transaction");
      
      TextField inputField=new TextField();
      
      bSubmit.setOnAction(e->
      {
                
            
                String input =inputField.getText();
                floatInput=Float.parseFloat(input);
                  transaction.setValue(floatInput);                     
                  switch(typeOfTransaction){
                      
                      case 1: 
                         //BalanceBefore=dummy.getBalance();
                         dummy.setBalance(transaction.Deposit());
                         dummy.save( "Deposit", floatInput);
                         dummy.setJ(dummy.getI()-1);
                         //BalanceAfter=dummy.getBalance();
                         //if(BalanceBefore!=BalanceAfter)
                         //{History.save(i, "Deposit", BalanceAfter-BalanceBefore);
                          //   i++;}
                                 
                          break;
                      case 2:
                          //BalanceBefore=dummy.getBalance();
                          if (dummy.getBalance()>=floatInput){
                         dummy.setBalance(transaction.Withdraw());
                         dummy.save( "Withdraw", floatInput);
                         dummy.setJ(dummy.getI()-1);
                          //BalanceAfter=dummy.getBalance();
                          }
                          else
                              AlertBox.display("Warning", "BALANCE TOO LOW");
                          break;
                  
                  }
                  
                SubmitFlag=true;
                window.close();
               
                //guiobj.feedback.setText("Deposit of "+" successful");
                
                
            
            
        });
      
            
     
      
      Button closeButton =new Button("Cancel");
      closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                CancelFlag=true;
                window.close();                         
                
            }
        });
      
      b0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inputField.appendText("0");
                
            }
        });
      b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inputField.appendText("1");
                
            }
        });
      b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inputField.appendText("2");
                
            }
        });
      b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inputField.appendText("3");
                
            }
        });
      b4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inputField.appendText("4");
                
            }
        });
      b5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inputField.appendText("5");
                
            }
        });
      b6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inputField.appendText("6");
                
            }
        });
      b7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inputField.appendText("7");
                
            }
        });
      b8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inputField.appendText("8");
                
            }
        });
      b9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inputField.appendText("9");
                
            }
        });
      bPoint.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inputField.appendText(".");
                
            }
        });
      clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inputField.clear();
                
            }
        });
      
      
          
      
      //if(CancelFlag)
          //return 0;
      GridPane layout=new GridPane();
        layout.add(label, 0, 0);
        layout.add(inputField, 0, 1);
        //layout.add(closeButton, 1, 6);
        layout.add(bSubmit, 0, 6);
        layout.add(clear, 2, 5);
        layout.add(bPoint, 1, 5);
        layout.add(b0, 0, 5);
        layout.add(b1, 1, 4);
        layout.add(b2, 2, 4);
        layout.add(b3, 0, 4);
        layout.add(b4, 1, 3);
        layout.add(b5, 2, 3);
        layout.add(b6, 0, 3);
        layout.add(b7, 0, 2);
        layout.add(b8, 1, 2);
        layout.add(b9, 2, 2);
        layout.setMinSize(100, 100);
        layout.setPadding(new Insets(10,10,10,10));
        //layout.setVgap(2);
        //layout.setHgap(1);
      //layout.getChildren().addAll(label, closeButton,inputField,bSubmit,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bPoint); //to be checked
      layout.setAlignment(Pos.CENTER);
      Scene scene=new Scene(layout);
      window.setScene(scene);
      window.show();    
      return dummy;
    }
    
}
