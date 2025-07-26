//Throw Vs Throws
  class ExceptionHandling{
   void divide(int a, int b) throws ArithmeticException{//Exception Bypass to main method
   if (b==0){
   throw new ArithmeticException();
 }
   else{
	 int c = a/b;
	  System.out.println("Result is :" +c);
     }
   }
	 public static void main(String []args){
		ExceptionHandling t1 = new ExceptionHandling();
		 try{
			 t1.divide(20,0);
		 }
		 catch(Exception e){
			 System.out.println("The value of b is Zero...");
		 }
	 }
  }
