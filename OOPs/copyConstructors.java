class Students{
    String name;
    int roll;
    String password;
    int marks[];

    // this is the default constructor, we have to write because java will not write default when some constructor is already written
    Students() {
        marks = new int[3];
    }
//shallow copy constructor
    Students(Students s1){
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    this.marks = s1.marks;
}
//deep copy constructor
//    Students(Students s1){
//        marks = new int[3];
//        this.name = s1.name;
//        this.roll = s1.roll;
//        for(int i = 0; i< marks.length; i++)
//                this.marks[i] = s1.marks[i]; // this will copy the array of marks to a new created array
//        }
}
public class copyConstructors{
    public static void main(String[] args) {
        Students obj = new Students();
        obj.name = "Aman";
        obj.roll = 101;
        obj.password = "abc123";

        obj.marks = new int[3];
        obj.marks[0] = 90;
        obj.marks[1] = 80;
        obj.marks[2] = 70;

        // Create a copy using the copy constructor
        Students obj2 = new Students(obj);

        // Change the original object's marks
        obj.marks[2] = 100;

        // Print both objects
        System.out.println("Original Object");
        System.out.println("Name : " + obj.name);
        System.out.println("Roll : " + obj.roll);
        System.out.println("Marks : " + obj.marks[0] + " " + obj.marks[1] + " " + obj.marks[2]);

        System.out.println();

        System.out.println("Copied Object");
        System.out.println("Name : " + obj2.name);
        System.out.println("Roll : " + obj2.roll);
        System.out.println("Marks : " + obj2.marks[0] + " " + obj2.marks[1] + " " + obj2.marks[2]);
 }
}