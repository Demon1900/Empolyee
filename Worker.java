//This class is for creating regular worker
public class Worker extends Manager{
double bonus=0;
  
  public Worker(String name,String gender,Jobtype job){
    super(name, gender, job);
    bonus=job.getpay()+this.bonus;
   
  }
  public double getpay(){
  return bonus;
  }
}
