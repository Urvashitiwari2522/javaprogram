 import java.util.*;
  class Bubblesort{
    public static void printArray(int arr[]){
    for(int i=0; i<arr.length; i++)
{
    System.out.println(arr[i] +"");
}
    }

  public static void main(String args[])
      {
	int arr[] = {2,8,9,12,23,1,0,5};
	//bubble sort
	// Time complexity = o(n^2)
	for(int i=0; i<arr.length-1; i++)
	   {
		 //inner loop
	for(int j=0; j<arr.length-i-1; j++)
    {
	 if(arr[j]>arr[j+1])
     {
	 //Swap
     int temp = arr[j];

     arr[j] = arr[j+1];
     arr[j+1] = temp;	 
		}
	  }
	}
	printArray(arr);
  }
}
