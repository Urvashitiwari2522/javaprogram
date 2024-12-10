import java.util.Scanner;
public class SalvageValuecalculator {
    public static void main(String[]args){
        //Create scanner object for input
        Scanner sc= new Scanner(System.in);
       //input purchase price , years of services , and annual depreciation
       System.out.println("Enter the purchage price of a item :");
       double purchasePrice = sc.nextDouble();
       System.out.println("Enter the year of service :");
       double serviceYear = sc.nextDouble();
       System.out.println("Enter the annual depreciation:");
       double depreciationYear = sc.nextDouble();
       // Calculate the salvage value using the formula
       // Salvage value = Purchase price -(annual Depreciation)*Year of service 
       double salvageValue = purchasePrice-(depreciationYear)*serviceYear;
       System.out.println("The salvage value of Item is:"+ salvageValue);


    }
    
}
