import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        //Input: Read the number
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int reverse =0;
        //To store the reserved number
        //Reserve the digits using a while loop
        while(number !=0){
            int lastDigit = number %10;
            //Extract the last digit
            reverse = reverse * 10 +lastDigit;
            number = number /10;
            //Remove the last digit
       }
      //Output the reversed number
      System.out.println("Reversed number :" + reverse);
      
    }
}
