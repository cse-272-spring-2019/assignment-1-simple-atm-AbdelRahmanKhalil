/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int accountnum=5797;                                               //account number is constant
        BankAccount User1=new BankAccount("mohammed",0,accountnum);              //string name entered is dummy 
        //PasswordValidation VAL=new PasswordValidation(User1.getNumber());
        //VAL.Validate();
        History history= new History();
        int i=0;                                                                 //successful transaction counter
        float BalanceBefore,BalanceAfter;
        
        
        int Action=0;
        float Value;                                                             //Value of transaction
             
        //Scanner scan=new Scanner(System.in);
        
        
        Transaction transaction= new Transaction(User1.getBalance());
        
        history.setJ(0);                                                         //Navigator variable J set to zero 
        //while(Action!=6){                                                        //history not implemented (counter i not implemented)
            //System.out.println("Enter action");
        //System.out.println("1 Withdraw");
        //System.out.println("2 Deposit");
        //System.out.println("3 Balance inquiry");
        //System.out.println("4 Previous transaction");
        //System.out.println("5 Next transaction");
        //System.out.println("6 Exit");
            //Action= scan.nextInt();                                              //takes action input from user
        //switch(Action) {
             //case 1:                                                             //Withdraw
             
                 System.out.println("Enter value of transaction");
                 Value=scan.nextFloat();
                 transaction.setValue(Value);
                 BalanceBefore=User1.getBalance();
                 User1.setBalance(transaction.Withdraw());
                 BalanceAfter=User1.getBalance();
                 if(BalanceBefore!=BalanceAfter)                                 //Only successful transactions are saved
                 {
                     history.save(i, "Withdraw", Value);
                     i++;
                     history.setJ(history.getI());
                     //if(i%6==0)
                        // i=i-5;
                     
                 }
                 System.out.println("Your balance is: "+User1.getBalance());
             
                //break;
            //case 2:                                                              //Deposit
                System.out.println("Enter value of transaction");
                Value=scan.nextFloat();
                transaction.setValue(Value);
                BalanceBefore=User1.getBalance();
                User1.setBalance(transaction.Deposit());
                BalanceAfter=User1.getBalance();
                if(BalanceBefore!=BalanceAfter)                                  //Only successful transactions are saved
                {
                    history.save(i, "Deposit", Value);
                    i++;
                    history.setJ(history.getI());
                    //if(i%6==0)
                        // i=i-6;
                    
                }
                //break;
            //case 3:                                                              //Balance Inquiry
                System.out.println("Current Balance:"+User1.getBalance());
                history.save(i, "Balance Inquiry", User1.getBalance());          //here save function takes value of transaction as balance user inquired for to save the inquiry
                i++;
                history.setJ(history.getI());
                //if(i%6==0)
                         //i=i-5;
                
                //break;
            //case 4:                                                              //Previous transaction
                history.previous();
                //break;    
            //case 5:                                                              //Next transaction   
                history.next();    
                //break;        
            //default:
                //System.out.println("Enter a valid action");
                
            
        
            
                
        
    
    
}
}
