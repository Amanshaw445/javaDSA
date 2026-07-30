//parent class/base class
class Animal{
    String color;
    void eats(){
        System.out.println("animal eats");
    }
    void breath(){
        System.out.println("animal breaths");
    }
}

// child class/derived class/sub class
class fish extends Animal{
    int fins;

    void swim(){
        System.out.println("fish swims");
    }
}

// Main class
class inheritance{
public static void main(String[] args) {
    fish shark = new fish();
    shark.eats();
}
}