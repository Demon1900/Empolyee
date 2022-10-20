class Jobtype{
  private double pay;
  private String job;

  public void setpay(double pay){
    this.pay=pay;
  }
  public double getpay(){
    return pay;
 }
  public void setjob(String job){
    this.job=job;
    }
  public String getjob(){
    return job;
  }

public void printjob(){

  System.out.println(getjob() +" jobs are open paying at $"+pay);
}
}
