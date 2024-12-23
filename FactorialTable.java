import java.util.Scanner;
public class FactorialTable {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        //Input : read the value of m 
        System.out.println("Enter the value of m to generate the factorial table:");
        int m = scanner.nextInt();
        //Print the table header 
        System.out.println("Number\tFactorial");
        //Compare and print the fatorials for number from 1 to n
        for(int i = 1;i<=m;i++){
            long factorial =1;
            //compute factorial of i
            for(int j=1;j<=i;j++){
                factorial *=j;
            }
            //Print the result
            System.out.printf("%d\t%d%n",i,factorial);
        } 
        scanner.close();
    }
}
