class Encapsulation{
    private int value;
    public void setValue(int x){
    value = x;
}
   public int getValue(){
       return value;
   }
}
   class Test{
     public static void main(String []args){
         Encapsulation s = new Encapsulation();
         s.getValue() = 100;
         System.out.print(s.getValue());
     }
   }