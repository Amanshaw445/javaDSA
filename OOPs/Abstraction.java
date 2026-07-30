public class Abstraction {
    public static void main(String args[]){
    Dog obj = new Dog();
    obj.legs();
    obj.walk();
    }
}

abstract class Animal{
    void walk(){
        System.out.println("Animal can walk");
    }
    abstract void legs();       //this is a abstract method so it needs to be implemented in a child before making its object.
}

class Dog extends Animal{
    void legs(){
        System.out.println("dog has 4 legs");
    }
}