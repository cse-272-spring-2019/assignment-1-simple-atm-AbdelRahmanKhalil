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
public class BankAccount {
    private  float []values=new float[100];
    private  String[]actions=new String[100];
    private int i=0;
    private int j=0;
    
    private String Name;                         //User name
    private int number;                          //Bank Account number
    private float Balance;
    
    //float []values=new float[100];
    //String[]actions=new String[100];
    
    public BankAccount(String name,float balance,int number){
            this.number=number;
            this.Name=name;
            this.Balance=balance;
    
}
    public  void next(){                                  
  
        System.out.println("i="+i);
        System.out.println("j="+j);
        
        if (j==i){                                                                       //j>=i instead of j==i
            TestingGUI.setLabel("Last transaction!");
            j=i;}
        else{
            
            TestingGUI.setLabel(actions[j]+":"+Float.toString(getValues(j)));
            j++;
            //System.out.println(getActions(j)+":");
            //System.out.println(getValues(j));
            
        }
        
        
    }
    void previous(){ 
        
        System.out.println("i="+i);
        System.out.println("j="+j);
        if (j<0){                                                                           //j<=0 instead of j==0
            TestingGUI.setLabel("First transaction!");
            j=0;
        }
        else{
            if(j==i)
            {
                j--;
                
            }
            TestingGUI.setLabel(actions[j]+":"+Float.toString(getValues(j)));              
            j--;
            //System.out.println(getActions(j)+":");
            //System.out.println(getValues(j));
            
        }
        
    }
     public  void save(String action,float value){
        //setI(dummyi);
         //if (Balance-getValues(i)>=0){                                               //i-1 instead of i
        actions[i]=action;
        values[i] = value;
         System.out.println(actions[0]);
         System.out.println(getValues(0));
         i++;
         //}
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Balance
     */
    public  float getBalance() {
        return Balance;
    }

    /**
     * @param Balance the Balance to set
     */
    public void setBalance(float Balance) {
        this.Balance = Balance;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

    /**
     * @return the j
     */
    public int getJ() {
        return j;
    }

    /**
     * @param j the j to set
     */
    public void setJ(int j) {
        this.j = j;
    }

    /**
     * @return the values
     */
    public float getValues(int dummyi) {
        return values[dummyi];
    }
    
    
}
