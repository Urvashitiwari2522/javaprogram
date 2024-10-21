import java.util.*;
 class Twodimension
 {
  public static void main(String arg[]){
  Scanner sc = new Scanner(System.in);
  int rows = sc.nextInt();
  int cols = sc.nextInt();
  int Number[][] = new int[rows][cols];
  for(int i=0; i<rows; i++)
  {
	for(int j=0; j<cols; j++)
	{
	 Number[i][j] = sc.nextInt();
	}
  }
  for(int i=0; i<rows; i++)
  {
	for(int j=0; j<cols; j++)
	{
	 System.out.println(Number[i][j] + " ");
  }
  System.out.println();
   }
  }
 }