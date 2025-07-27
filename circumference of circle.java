//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;
 class Circumference{
	 public static void cirlceCircumference(float r){
		 int pie = 3.14;
		 int circumference = pie*r*r;
		 return circumference;
	 }
	 public static void main(String []A){
		Scanner sc = new Scanner(System.in);
        int r = sc.nextFloat();
        cirlceCircumference(r)		
	 }
 }