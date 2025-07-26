class Animals{
    void sound(){
        System.out.print("Animals make sound...");
    }
}
class Dog extends Animals{
    void bark(){
        System.out.println("Barking...");
    }
} 
class Cat extends Dog{
    void meow(){
        System.out.println("meowing...");
    }
}
 class MultilevelInheritance{
    public static void main(String []X){
        Cat sc = new Cat();
        sc.meow();
        sc.bark();
        sc.sound();
    } 
 }