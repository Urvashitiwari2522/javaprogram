import java.util.Scanner;
public class LinearEqSolver {
 public static void main(String[]args){
  // Input : Read constant a,b,c,d,m and n
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the value of a:");
    double a = scanner.nextDouble();
    System.out.println("Enter the value of b:");
    double b = scanner.nextDouble();
    System.out.println("Enter the value of c:");
    double c = scanner.nextDouble();
    System.out.println("Enter the value of d:");
    double d = scanner.nextDouble();
    System.out.println("Enter the value of m:");
    double m = scanner.nextDouble();
    System.out.println("Enter the value of n:");
    double n = scanner.nextDouble();
    double denominator = a*d - b*c;
    //Chcek if the denoinator is Zero
    if(denominator == 0){
        System.out.println("The equation do not have a unique solution (denominator is zero).");
    }
    else {
        //Calculate X1 and X2
        double x1 = (m*d-b*n)/denominator;
        double x2 = (a*n-m*c)/denominator;
        //Output the results
        System.out.printf("The solution is : x1 = %.2f, x2 = %.2f" ,x1,x2);
    }
        scanner.close();
 }
}
