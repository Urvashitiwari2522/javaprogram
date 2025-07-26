// Multithreading by Implementing Runnable interface...
   class Mythread1 implements Runnable{
	public void run(){
		int i=0;
		while(i<=50){
			System.out.println("First statemenet is executing...");
			System.out.println("I am happy...");
			i++;
		}
	} 
} 
   class Mythread2 implements Runnable{
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
		   Thread sc = new Thread(t1);
		   Mythread2 t2 = new Mythread2();
		   Thread sc2 = new Thread(t2);
		   sc.start();
		   sc2.start();
	   }
   }