//This will be an abstract class that will be use to make the Employee.

abstract class Empolyee extends Job{
  public String name;
  public String gender;
  
  public Empolyee(String name,String gender){
    this.name=name;
    this.gender=gender;
    System.out.println("\nA " + gender +" name " + name +" has been added to the company");
  }

public String name(){
  return name;
}
}
