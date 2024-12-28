import java.util.Scanner;
class DistanceCalculator{
    //method to calculate distance
    public static double calculateDistance(double u, double a, double t){
        return u*t+(a*t*t)/2;
    }  
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
       System.out.print("Welcome to the Distance Calculator Program: ");
       while(true){
        try{
            //Get user inputs for initial vilocity and acceleration  
            System.out.println("Enter the initial velocity (u) in meters per second:");
            double u = scanner.nextDouble();
            System.out.println("Enter the acceleration (a) in meter per secoond squared:");
            double a = scanner.nextDouble();
            System.out.println("Enter the total time (t) in seconds:");
            double totalTime = scanner.nextDouble();
            System.out.println("Enter the time interval(in second):");
            double interval = scanner.nextDouble();
            
            //Validate input
            if(interval <=0 || totalTime <=0){
                System.out.print("Time and interval must be positive number. Please try again.");
                continue;

            }
           //Display distance at each interval
           System.out.println("\nTime(s) Distance(m)");
           for(double time =0;time<=totalTime;time+=interval){
           double distance  = calculateDistance( u,a,time);
           System.out.printf("%8.2f 58.2f\n" , time , distance);
           }
           //Check if user wants to repeat   
         System.out.println("\nDo you want to calculate again?(yes/no)");
         String choice = scanner.next();
         if(! choice.equalsIgnoreCase("yes")){
            System.out.println("Existing program.Goodbye!");
            break;
         }
      }
         catch(Exception e){
            System.out.println("Invalid input.Please enter numerical values only.");
           scanner.next();
           //Clear invalid input
            }
        }
           scanner.close();
        }
     }
    
