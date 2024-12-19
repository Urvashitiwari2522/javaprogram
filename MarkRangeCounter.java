 import java.util.Scanner;
 public class MarkRangeCounter{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        //Input: List of marks
        System.out.println("Enter the marks of Students seperated by space:");
        String[] marksInput = scanner.nextLine().split("");
        //Initialize counters for each range
        int []ranges = new int[4];
        //ranges[0]:81-100, ranges[1]:61-80, range[2]:41-61, range[3]:0-40
        //Process each mark
        for(String markStr: marksInput){
            int mark = Integer.parseInt(markStr);
            //Determine the range using conditional logic
            if(mark>=81){
                ranges[0]++;
            }
            else if(mark>=61){
                ranges[1]++;
            }
            else if(mark>=41){
                ranges[2]++;
            }
            else{
                ranges[3]++;
           }  
        }          

          System.out.println("\nNumber of Students in each ranges:");
          System.out.println("81-100:" +ranges[0]);
          System.out.println("61-80:" +ranges[1]);
          System.out.println("41-60:" +ranges[2]);
          System.out.println("0-40:" +ranges[3]);
            scanner.close();
        }
 }