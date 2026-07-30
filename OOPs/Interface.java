class Interface{
    public static void main(String[] args){
        fish goldfish = new fish();
        goldfish.swim();
        goldfish.color();
        System.out.println(goldfish.A);
    }
}
interface Animal{           // inside interface everyhting is public static final
    int A = 10;
    void swim();
    void color();
}

class fish implements Animal{
    public void swim(){
        System.out.println("fish swim in water");
    }
    public void color(){
        System.out.println("red");
    }
}