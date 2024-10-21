import java.util.*;
class Factorials {
	public static void printFactorials(int n)
	{
	 if(n<0){
	 System.out.print("invalid");	 
  }	
  int factorial = 1;
  for(int i=n; i>=1; i--)
    {
	  factorial = factorial * i;
     }
	  System.out.print("factorial is:" + factorial);
     return ;  
    }
	public static void main(String []A)
	{
	Scanner sc  = new Scanner(System.in);
	int n = sc.nextInt();
	printFactorials(n);
		
	}
}
		

