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
public class Transaction {
                                                         //implement history
    private float Balance;                               
    private float Value;                                //value of withdrawal or deposit
    
  
    
   public float Withdraw(){
        if (Balance<Value){
            //System.out.println("Your balance is too low for this value of withdrawal");
            AlertBox.display("ALERT", "BALANCE TOO LOW");
        }
        else{
        
            Balance-=Value;
            
        }
        return Balance;
    }
   public float Deposit(){
       Balance+=Value;
       return Balance;
   }
   

    /**
     * @return the Value
     */
    public float getValue() {
        return Value;
    }

    /**
     * @param Value the Value to set
     */
    public void setValue(float Value) {
        this.Value = Value;
    }
    public Transaction (float CurrentBalance){
        this.Balance=CurrentBalance;
        
    }


   
  
            
    
}
