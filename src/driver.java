
public class driver extends staff implements ITask{
    driver(int id, String name, int phn_num)
    {
        super(id, name, phn_num);
    }
   
       public String check_time(int a)
    {
        System.out.println("1st bus started at 10.20 am");
        System.out.println("2nd bus started at 1.20 pm");
        System.out.println("last bus started at 6.30pm");
           return null;
        
    }
           public double Staff_salary(double a,double b){
                   double salary=a+b;
                   return salary;
           }
          public String check_ticket(int no_of_seat){
              if(no_of_seat==1){
                  return "seat available";
                  
              }
              else
                  return "Waiting";
          }

   
              
  
}
