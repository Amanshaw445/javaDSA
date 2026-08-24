//

class friendsPairing{
    public static int friendsPairing(int n){
    if(n == 0|| n == 1){
        return 1;
    }
//    if it remains single
    int fn_mins1 = friendsPairing(n-1);
//    if it pairs then will get (n-1) no of students to choose from and then for reamining students we will call the function again
    int fn_mins2 = friendsPairing(n-2);
    int pairWays = (n-1) * fn_mins2;

    int totalNoOfWays = fn_mins1 + pairWays;
    return totalNoOfWays;
    }
    public static void main(String args[]){
    int ans = friendsPairing(10);
    System.out.println(ans);
    }
}