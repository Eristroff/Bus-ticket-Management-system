
abstract class staff {
    protected int id;
    protected String name;
    protected int phn_num;
   staff(int a,String b,int c){
       this.id=a;
       this.name=b;
       this.phn_num=c;
   }
    abstract double Staff_salary(double a,double b);
    abstract String check_ticket(int a);
    
}
