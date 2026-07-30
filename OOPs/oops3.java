//class students{
//    String name;
//    int roll;
//
////    students(){   //constructor
////        System.out.println("constructor is called");
////    }
//    students(String name){
//        this.name = name;
//    }
//}
//constructor overloading (polymorphism)
class Students{
    String name;
    int roll;

    Students(){
        System.out.println("here the non parameterised constructor was called");
    }
    Students(String name){
        this.name = name;
        System.out.println("here the parameterised constructor was called");
    }
    Students(int roll) {
        this.roll = roll;
        System.out.println("here the parameretised constructor was called and the parameter was roll");
    }
}

public class oops3{
    public static void main(String[] args) {
//    students obj = new students();  // students() is calling the constructor, if a constructor is present then will call it if not present java compiler will create it own its own
//        students obj = new students("aman");
//        System.out.println(obj.name);

Students obj1 = new Students("aman");
Students obj2 = new Students(8);
Students obj3 = new Students();
//Students obj4 = new Students("aman",008);// this will not be called because we dont have a constructor with these requirment.
    }
}