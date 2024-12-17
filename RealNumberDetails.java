
import java.util.Scanner;
public class RealNumberDetails{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        //Prompt the user to enter the real number
        System.out.println("Enter the Real Number :");
        double number = scanner.nextDouble();
        //Calculate the smallest integer not less than the number(ceiling)
        int smallestNotLess = (int)Math.ceil(number);
        //Calculate the largest integer not more then the number (ceiling)
        int largestNotGreater = (int)Math.floor(number);
        //Print the output in required formate
        System.out.println(largestNotGreater+ " not greater than " + number + " not less than " + smallestNotLess);
    }
}