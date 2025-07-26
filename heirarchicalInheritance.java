class Employee{
 void name(){
	 System.out.println("Name of Employee is: Harry ");
	 
    }
  } 
 class Address extends Employee{ //Extends super class
	 void add(){
		 System.out.println("Address : Utterpradesh");
	 }
 }  
 class Jobprofile extends Employee{ //Extends super class
	 void position(){
		 System.out.println("Role Specification: Software developer");
	 }
 }
  class Details{
	  public static void main(String[]args){
		  Jobprofile emp = new Jobprofile();
		  emp.name();
		  emp.position();
		  Address emp1 = new Address();
		  emp1.add();
	  }
	  
  }