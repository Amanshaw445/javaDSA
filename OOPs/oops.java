class Pen{
    String color;
    int tip;

    void setColor(String newColor){ // this will behave as a setter to set color because the color is private and cant be accesed from outside.
        color = newColor;
    }
    void setTip(int newTip){
    tip = newTip;
    }
}

class BankAccount{
    String userName;
    private String password;

    void setPassword(String newPassword){
        password = newPassword;
    }
    String getPassword(){
        return password;
    }
}

public class oops{

    public static void main (String args[]) {
//        Pen p1 = new Pen();// object created called p1
//        p1.setColor("blue");
//        p1.setTip(5);
//        System.out.println(p1.color);
//        System.out.println(p1.tip);
//        p1.setColor("red");
//        System.out.println(p1.color);
        BankAccount account1 = new BankAccount();
        account1.userName = "Aman123";
        System.out.println(account1.userName);
        account1.setPassword("chutiya@123");
//      System.out.println(account1.password); this will not work because the private access modifier will restrict it visiblity. so wee use getters here.
        System.out.println(account1.getPassword());
    }
}