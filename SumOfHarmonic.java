import java.util.Scanner;
class HarmonicSum{
  public static void main(String[]args){
    //Create a sc object for user input
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of term:");
    int n = sc.nextInt();
    //Check if the input is valid( n should be greater than 0)
    if(n<=0){
      System.out.println(" Please enter positive number:");
    }
    else{
      //Calculate the sum of harmonic series
      double sum = 0.00;
      for(int i=1;i<=n;i++){
      sum +=1.0/i;
      }
      //Display the result
      System.out.println( "The sum of harmonic series in :" +sum);
      
    }
  } 
}