class Animal{
    String color;
    void eats(){
        System.out.println("Animal eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}

class mammals extends Animal{
    int legs;
}

class dogs extends mammals{
    String breed;
}

class inheritance2{
    public static void main(String[] args) {
    dogs rio = new dogs();
    rio.eats();
    rio.legs = 4;
    System.out.println(rio.legs);
    }
}