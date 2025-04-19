import java.util.Scanner;
class PriceToPaise{
	//Main method
    public static void main(String[]args){
		//create an object scanner for  user input
        Scanner scanner = new Scanner(System.in);
		//Input from user
    System.out.println(" Enter the price of an item in decimal form (eg: 76.45):");
    double price = scanner.nextDouble();
    //Conver the price to paise (1 Rupee = 100 Paise)
    int paise = (int)Math.round(price*100);
    //print the result
        System.out.println("The price in paise is:" + paise +"paise");
    }
}
