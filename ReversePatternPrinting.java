public class ReversePatternPrinting {
 public static void main(String[]args){
   //outer loop for row
    for(int i=5;i>=1;i--){
        //Inner loop for columns
        for(int j=i;j>=1;j--){
            System.out.print("$");
        }
        System.out.println();
      }
    }
}
