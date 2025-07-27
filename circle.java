//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;
 class Circumference{
	 public static void cirlceCircumference(double radius){
		 double pie = 3.14;
		 double circumference = pie*radius*radius;
		 System.out.println("circumference of circle is:" +circumference );
	      return ;
	 }
	 public static void main(String []A){
		Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        cirlceCircumference(radius);		
	 }
 }