import java.util.*;
class Searching
{
	public static void main(String []Q)
	{
	Scanner sc = new Scanner(System.in);
	int Size = sc.nextInt();
	int Number = new int[Size];
	//Input
	for(int i=0; i<Size; i++){
    Number[i] = sc.nextInt();
     }
	for(int i=0; i<Size; i++)
	{
		System.out.println(Number[i]);
	 }
    //Output
	int X = sc.nextInt();
	for(int i=0; i<Number.length; i++)
	{
    if(Number[i]==X)
	{
     System.out.println("Element found at:" +X);
	  }
	}
  }
}