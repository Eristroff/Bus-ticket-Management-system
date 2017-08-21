
public class busclass {
    String username;
    String pin;
    String a="yes";
    String d="b-cash";
    busclass(String username,String pin){
        this.username=username;
        this.pin=pin;
    }
    int login(){
        if(a.equals("yes"))
            return 1;
        else
            return 0;
        
    }
   
    int quantity(int a,int b)
    {
        return a*b;
    }
    double gotdiscount(int result){
        return result;
    }

   int payment(){
       if(d.equals("b-cash"))
        return 1;
       else
           return 0;
       
       
               
   } 
    
}
