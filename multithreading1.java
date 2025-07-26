// Multithreading by extending thread class
   class Mythread1 extends Thread{
	public void run(){
		int i=1;
		while(i<=50){
			System.out.println("First statemenet is executing...");
			System.out.println("I am happy...");
			i++;
		}
	} 
} 
   class Mythread2 extends Thread{
	public void run(){
		 int i=1;
		 while(i<=50){
			 System.out.println("Second statement is executing...");
			 System.out.println("Now, i am sad...");
             i++;		
		}
	 }
 } 
   class Test{
	   public static void main(String args[]){
		   Mythread1 t1 = new Mythread1();
		   Mythread2 t2 = new Mythread2();
		   t1.start();
		   t2.start();
	   }
   }