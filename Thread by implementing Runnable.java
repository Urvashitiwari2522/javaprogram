
class MyThreadRunnable1 implements Runnable
{
   public void run(){
     int i=1;
     while(i<50){
       System.out.println("I am thread1 not threat");
     }
   }
}
class MyThreadRunnable2 implements Runnable
{
   public void run(){
     int i=1;
     while(i<50){
       System.out.println("I am thread2 not threat");
     }
   }
} 
 public class Test{
   public static void main(String [] args){
      
       MyThreadRunnable1 s1 = new MyThreadRunnable1();
       Thread t1 = new Thread(s1);
   
       MyThreadRunnable2 s2 = new MyThreadRunnable2();
       Thread t2 = new Thread(s2);
       t1.start();
       t2.start();
   }
 }





