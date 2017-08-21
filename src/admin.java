
public class admin extends staff implements ITask {
    int bus_no;
    admin(int id, String name, int phn_num)
    {
        super(id, name, phn_num);
    }
    public String check_time(int a)
    {
     if(a==1){
         return "bus available";
     }
     else if(a==2){
         return "Available but late";
     }
     else{
         return "not available";
     }
        
    }
    public void check_driver_availablity(int driver_id)
    {
        if(driver_id==1)
        {
            System.out.println("available");
        }
        else
            System.out.println("not available");
        
    }


    @Override
    double Staff_salary(double a, double b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    String check_ticket(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


