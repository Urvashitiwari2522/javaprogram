class Adder
{
    static int add(int x, int y, int z)
    {
        return x+y+z; 
    }
    static double add(double x, double y, double z)  
    {  
       return x+y+z;
    }
}
    class Testorverloading    {
        public static void main(String arg[])
        {
          System.out.println(Adder.add(24, 43, 12));
          System.out.println(Adder.add(12.3, 32.7, 54.2));
        }
    }