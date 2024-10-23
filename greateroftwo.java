
//Write a function which takes in 2 numbers and returns the greater of those two
import java.util.*; 
class Greater
{
  public static void greaterOfTwoNo(int a, int b){
	 if(a > b){
	System.out.println("A is greater then B");
	 }
	else{
		System.out.println("B is greater then A");
	}
	return;
  } 
	 public static void main(String[]X){
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 greaterOfTwoNo(a,b);
	 }
}