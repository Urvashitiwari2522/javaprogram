class Girl
{
    static void hard()
    {
      System.out.println("Hardworking..");
    }
}
class Boy extends Girl
{
    static void lazy()
    {
    System.out.println("laziness");
    }
}
 class Inheritance
 {
    public static void main(String []args)
    {
      Boy s1 = new Boy();
      s1.lazy();
      s1.hard();

    }
 }