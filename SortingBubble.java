import java.util.*;
class Bubblesort{
	public static void printArray(int arr[]){
	 for(int i=0; i<arr.length; i++){
		 System.out.println(arr[i]+ "");
	  }
	  System.out.println();
	}
	public static void main(String[]X){
		Scanner sc = new Scanner(System.in);
		int Size = 0;
		Size = sc.nextInt();
		int arr[] = new int[Size];
		//int arr[] = {12, 3, 4, 5, 23, 19, 10, 11};
		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-i-1; j++){
				if(arr[j] > arr[j+1]){
				int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
				
				}
			}
		}
		printArray(arr);
	}
}