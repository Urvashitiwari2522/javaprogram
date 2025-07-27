class Students{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
class Opps{
    public static void main(String []args){
        Students s1 = new students();
        s1.name = "Aman";
        s1.age = 20;
        s1.printInfo();
    }
}