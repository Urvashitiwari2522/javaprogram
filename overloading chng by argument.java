class Addition{
    static int add(int a, int b)
    {
        return a+b;
    }
    static int add(int a, int b, int c)
    {
        return a+b+c;
    }
    static float add(int a, float b)
    {
       return a+b;
    }
}
  class Testoverloading
  {
    public static void main(String[]arg)
    {
        System.out.println(Addition.add(10, 10));
        System.out.println(Addition.add(10, 10, 15));
        System.out.println(Addition.add(10, 12.2f));
       
    }
  }