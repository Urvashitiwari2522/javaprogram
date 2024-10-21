import java.util.*;
class Functions 
{
  public static int calculateSum(int a, int b)
  {
  int sum = a + b;
  return sum;
  }	  
  public static void main(String[]X)
  {
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 int sum = calculateSum(a,b);
	 System.out.println("Sum of two numbers:" +sum);
  }
}
