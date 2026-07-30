class Pen2{
    private String color;
    private String tip;

    void setColor(String newColor){ //setter
        this.color = newColor;
    }
    String getColor(){      //getter
        return color;
    }
    void setTip(String tip){
        this.tip = tip;  //this is used because the instance variable and the parameter have the same name. "this.tip" refers to the object's variable, while tip refers to the method parameter."
    }
    String getTip(){
        return tip;
    }
}
public class oops2{
    public static void main(String args[]){
        Pen2 obj = new Pen2();// object created called p1
        obj.setColor("blue");
        obj.setTip("5");
        System.out.println(obj.getColor());
        System.out.println(obj.getTip());
        obj.setColor("red");
        System.out.println(obj.getColor());
    }
}