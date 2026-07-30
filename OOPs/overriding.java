public class overriding{

 public static void main(String[] args){
     Dog obj = new Dog();
     obj.eats();
 }
}
class Animal{
    void eats(){
        System.out.println("Animal eats");
    }
}
class Dog extends Animal{
    void eats(){
        System.out.println("Dog eats");
    }
}
