public class Divisibleby7 {
public static void main(String[]args){
    int count = 0;
    int sum = 0;
    //Loop through numbers between 101 and 199 
    for (int i=101;i<200;i++){
        if(i%7==0){
            count++;
            sum+=i;
        }
    }
    //Display the results
    System.out.println("Number of integers divisible by 7:"+ count);
    System.out.println("Sum of integers divisible by 7:"+sum);
  }    
}
