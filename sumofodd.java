//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
 class sumOfOdd
 {
	 public static void SumOddNumber(int n){
		 int sum = 0;
	 for(int i=1; i<=n; i++)
	 {	
      if(n % 2 != 0){
      sum = sum + i;
	 System.out.println("Sum of odd number is:" +sum);
	 return;
	 }
	}
   }
	 public static void main(String []X){
	  Scanner sc = new Scanner(System.in);	
     int n = sc.nextInt();
      SumOddNumber(n);	 
    }
 }
