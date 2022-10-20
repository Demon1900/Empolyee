//This class is when you want to create a manager
public class Manager extends Empolyee {

double bonus=1000;
  
  public Manager(String name, String gender,Jobtype job) {
    super(name, gender);
     bonus=job.getpay()+this.bonus;
    System.out.println(name + " is now a "+ job.getjob());
  }
  public double getpay(){
  return bonus;
  
}
}
