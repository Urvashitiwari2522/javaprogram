import java.util.Scanner;
class FahrenheitToCelsius{
    public static void main(String[]args){
        // Create an scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Taking input from user
        System.out.println("Enter the temperature in fahrenheit:");
       double fahrenheit =scanner.nextDouble();
       double celsius = 0.00;
       // conversion of temperature fahrenheit to celsius
        celsius = (fahrenheit-32)/1.8;
        //Display result
       System.out.println("Value of temperature in celsius:" + celsius);
    }
}