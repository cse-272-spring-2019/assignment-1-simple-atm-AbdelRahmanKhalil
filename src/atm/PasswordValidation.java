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
public class PasswordValidation {
    
    String fromuser;                                 //user entered number
    String fromaccount;
    Scanner scan=new Scanner(System.in);
    
    public boolean Validate (String fromuser)
    {
                                    
        
        if(fromaccount.equals(fromuser))
        {
            return true;   
        }
        else 
            return false;
    }
    
    public PasswordValidation(String fromaccount)
    {
        this.fromaccount=fromaccount;
    }
}
