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
public class Card extends BankAccount{
   final int Cardnum = 5797;
   
   
   public Card (String name,float balance)
           
   {
       this.Name=name;
       this.Balance=balance;
   }
    
}
