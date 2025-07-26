//Access Modifier in Java
class Bank{
    public String name;//public modifier
    String bankname;//Default  modifier
    protected String emailId;//protected modifier
    private int atmPin;//private modifier
   //getters and setters
   public int getAtmPin(){
    //this Keyword
    return this.atmPin;
   }
   public void setAtmPin( int pin){
    //this Keyword
     this.atmPin = pin;
   }
}
class Access{
    //Main method
    public static void main(String args[]){
        //Create an account object
        Bank account = new Bank();
        account.name = "Harsh";
        account.bankname = "State bank of India";
        account.emailId ="Harsh23@gmail.com";
        //display Info 
        System.out.println("Coustomer Details:" +"\n" +"Bank Name : " +account.bankname + "\n"+ "Name of Coustomer :" + account.name + "\n"+ "Email Id is :" + account.emailId + "");
        account.setAtmPin(3324);
        System.out.println("Atm pin is :" +account.getAtmPin());
    }

}