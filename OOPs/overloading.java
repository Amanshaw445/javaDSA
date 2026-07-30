public class overloading{       //sum is the overloaded method

    int sum(int a,int b){
        return a+b;
    }
    double sum(double a, double b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String args[]){
        overloading obj = new overloading(); //object created
        System.out.println(obj.sum(14, 15));
        System.out.println(obj.sum(14.7 ,0.3));
        System.out.println(obj.sum(5, 6, 4));
    }
}
