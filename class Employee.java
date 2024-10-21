class Employee
{
    int id;
    String name;
    double salary;
     String address;
     public void printEmployeeDetails()
     {
         System.out.println("my id is "+id);
         System.out.println("my name is "+name);
         System.out.println("my salary is " +salary);
         System.out.println("i am from " +address);
     }
     public static void main(String []X)
     {
         Employee harry = new Employee();
         harry.id = 48392;
         harry.name = "roby";
         harry.salary = 4943.90;
         harry.address = "UK";
         Employee john = new Employee();
         john.id = 5342;
         john.name ="soby";
         john.salary = 34343.09;
         john.address = "india";
    john.printEmployeeDetails();     
    harry.printEmployeeDetails();
     }
}