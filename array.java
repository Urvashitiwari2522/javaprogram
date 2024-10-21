import java.util.*;
class Arrays
{
	public static void main(String []A){
	Scanner sc =  new Scanner(System.in);
	/*int [] marks = new int [6];
	 marks[0] = 70;//MATHEMATICS ||
	 marks[1] = 60;//DBMS
	 marks[2] = 79;//COA
     marks[3] = 73;//DATA STRUCTURE
     marks[4] = 75;//SOFTWARE ENGINEERING
	 marks[5] = 78;//PRINCIPPLE OF MANAGEMENTS
	System.out.println("MATHEMATICS:" +marks[0]);			
	System.out.println("DBMS:" +marks[1]);	
	System.out.println("COA:" +marks[2]);	
	System.out.println("DSA:" +marks[3]);	
	System.out.println("SE:" +marks[4]);	
	System.out.println("POM:" +marks[5]);*/
	
	int Size = sc.nextInt();
	int marks[] = new int[Size];
	//input
	for(int i=0; i<Size; i++){
	 marks[i] = sc.nextInt();
	}
	//output
	 for(int i=0; i<Size; i++){
		System.out.println(marks[i]);
	}
  }
 }