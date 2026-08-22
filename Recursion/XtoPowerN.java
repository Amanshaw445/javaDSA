public class XtoPowerN {

    static int XtoPowerN(int x, int n){
        if(x == 0){
            return 0;
        } else if (n == 0) {
            return 1;
        }
        int ans = x * XtoPowerN(x , n-1);
        return ans;
    }

    public static void main(String args[]){
        System.out.println(XtoPowerN(5,5));
    }
}