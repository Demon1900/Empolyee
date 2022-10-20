//Hello for my final project I decide to create a recruiting program.
//Here you will be able to create jobs,add empolyees,display who works for you. It a very interactive software.

import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in); 
                  //Below are arraylist that will add your jobs,empolyee name's and pay.
    Jobtype job= new Jobtype();
    ArrayList<String> E= new ArrayList<String>();
    ArrayList<String> Sear= new ArrayList<String>();
    ArrayList<String> Jobs= new ArrayList<String>();
    ArrayList<Double> Pay= new ArrayList<Double>();
     Jobtype v=new Jobtype();
    int num;
    do{
      //When running the program this will be the first thing that display.
      System.out.println("\nPick number");
      System.out.println("1.Create new job ");
      System.out.println("2.Add an Empolyee");
      System.out.println("3.Display Jobs");
      System.out.println("4.Display Empolyees");
      System.out.println("5 Exit");
      
        num=sc.nextInt();
    switch(num){
      case 1: //For case 1 you will create your job
        System.out.println("What will the job be called");
        String job_name=sc.next();
          System.out.println("How much will the job pay?");
        double payrate=sc.nextDouble();
        v.setjob(job_name);
        v.setpay(payrate);
        v.printjob();
        Jobs.add(job_name);
        Pay.add(payrate);
        
          
        break;
      case 2: //For case 2 it will ask who ae you hiring.
        
        System.out.println("What is the Empolyee name");
         String name=sc.next();
        
        System.out.println("What is their gender.");
         String gender=sc.next();
        
        System.out.println("What job will they have?");
          String role=sc.next();
        System.out.println(role.equalsIgnoreCase(Jobs.get(1)));
          
         try{for(int i=0;i<Jobs.size();i++)
         {System.out.println(Jobs.get(i));
            if(role.equalsIgnoreCase(Jobs.get(i)))
            {
               job.setjob(role);
               job.setpay(Pay.get(i));
              Sear.add(role);
               Worker nam= new Worker(name,gender,job);
               E.add(nam.name); 
               
            }
          else if(!role.equalsIgnoreCase(Jobs.get(Jobs.size()))){System.out.println("lol");}
           
          }
            }catch(Exception e){
           System.out.println("Error");}
        break;
      
      case 3://Will show the availabe job
        System.out.println("\nAvailabe Jobs");
        
        for(int i=0;i<Jobs.size();i++){
          System.out.println(i+1 +". "+Jobs.get(i)+" :$"+ Pay.get(i));}
       break; 
      case 4://Will show the employee
        System.out.println("\nAll Employee");
        for(int i=0;i<Jobs.size();i++){
            System.out.println(Jobs.get(i)+"\n");
           for(int j=0;j<E.size();j++)
             {
               if(Jobs.get(i).equalsIgnoreCase(Sear.get(j))){
                 System.out.print(E.get(j)+"\t");
               }
             }
        }
        
        break;
      default:
        System.out.println("No an option");
        break;
    }
    }while(num !=5);
    System.out.print("bye");
    sc.close();
  }
}
