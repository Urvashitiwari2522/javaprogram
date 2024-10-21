//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote
import java.util.*;
class Eligibility{
public static void ageForVote(int age){
	if(age>=18){
	System.out.println("eligible for vote:");	
	}
	else {
	System.out.println("Not eligible for vote:");
	return;
	  }
	}
   public static void main(String X[]){
	 Scanner sc = new Scanner(System.in);
	 int age = sc.nextInt();
	 ageForVote(age);
   }
}

 
