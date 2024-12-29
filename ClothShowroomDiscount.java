import java.util.Scanner;
public class ClothShowroomDiscount {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        //Input: Purchase amount and type of item
        System.out.println("Enter the purchase amount :");
        double amount = scanner.nextDouble();
        System.out.println("Enter the type of item(1 for Mill Cloth, 2 for Handloom items):");
        int itemType = scanner.nextInt();
        double discount = 0.0;
        //Determine discount based on purchase amount and item type
        switch (itemType){
        case 1: //Mill Cloth
        if(amount <=100){
            discount = 5.0;
        }
        else if(amount <=200){
            discount = 5.0;
        }
            else if(amount <=300){
                discount = 7.5;
            }
        else {
            discount = 10.0;
        }
        break;
       case 2://Handloom Items
       if(amount<=100){
       discount = 5.0;
       }
       else if(amount<=200){
        discount = 7.5;
       }
       else if(amount<=300){
        discount = 10.0;
       }
       else{
        discount = 15.0;
       }
       break;
       default:
       System.out.println("Invalid item type. Please enter 1 for Mill Cloth or 2 for Handloom item.");
       scanner.close();
       return;    
    }
      //Calculate the next amount
      double discountAmount = (discount/100)*amount;
      double netAmount = amount-discountAmount;
      //output the results
      System.out.printf("Purchase amount:%.2f\n",amount);
      System.out.printf("Discount Applied: %2f\n", discount);
     System.out.printf("Discount Amount: %2f\n", discountAmount);
      System.out.printf("Net Amount to be Paid : %2f\n" ,netAmount);
      scanner.close();
    }
}
