/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;




/**                                                                                               //DO OBJECT HISTORY IN TESTINGGUI THAT WILL CARRY ALL INFO OF PREV TRANSACTIONS AND UPDATE ITSELF AFTER EVERY TRANSACTION 
 *
 * @author Lenovo
 */
public class History {                          //not implemented in main
                                                //i (counter) not used in main
    private  float []values=new float[100];
    private  String[]actions=new String[100];    //MAKE SURE EACH 5 SUCCESSFULL ACTIONS YOU DELETE ALL ACTIONS IN THIS ARRAY
    
    private BankAccount USER=new BankAccount("name",0,0);
      int i;
    
    public History(BankAccount USER){
        
        this.USER=USER;                                                             //will not return user ,just to take up to date history from other classes
        
    }
    
    private  int j;                              //j is the navigator variable used by next() and previous () to imaginary scroll/navigate through history of actions
                                                //i is order or number of last transaction done or counter of transactions/inquiry that only increments when an inquiry or transaction is executed
    public  void next(){                                  
  
        if (j==i)
            TestingGUI.setLabel("Last transaction!");
        else{
            j++;
            TestingGUI.setLabel(actions[j]+":");
            TestingGUI.setLabel(Float.toString(values[j]));
            //System.out.println(getActions(j)+":");
            //System.out.println(getValues(j));
            
        }
       
        
        
    }
     void previous(){ 
        
        if (j==0)
            TestingGUI.setLabel("First transaction!");
        else{
            TestingGUI.setLabel(actions[j]+":");
            TestingGUI.setLabel(Float.toString(values[j]));
            //System.out.println(getActions(j)+":");
            //System.out.println(getValues(j));
            j--;
        }
        
    }
    public  void save(int dummyi,String action,float value){
        //setI(dummyi);
        actions[i]=action;
        setValues(value);
        
    }

    /**
     * @return the values
     */
    public float getValues(int j) {
        return values[j];
    }

    /**
     * @param values the values to set
     */
    public  void setValues(float value) {
        values[i] = value;
    }

    /**
     * @return the actions
     */
    public String getActions(int j) {
        return actions[j];
    }

    /**
     * @param actions the actions to set
     */
    public void setActions(String action) {
        actions[i] = action;
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
    public  void setI(int dummyi) {
        i = dummyi;
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
}
