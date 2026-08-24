/*
Problem 11: Tiling Problem

Given a "2 x n" board and tiles of size "2 x 1", count the number of
ways to tile the given board using the 2 x 1 tiles.
(A tile can either be placed horizontally or vertically.)
*/

class tilingProblem{

    public static int tilingProblem(int n){ //2*n is the floor size
        if(n==0 || n==1){
            return 1;
        }
//        vertical choice
        int f_n_Minus1 = tilingProblem(n-1);
//        hirizontal choice
        int f_n_Minus2 = tilingProblem(n-2); // because if we put one tile horizontally then one more needs to be placed under it then the same function can be called for the remaining rectengle floor
        return f_n_Minus1 + f_n_Minus2 ;
    }
    public static void main(String args[]){
        int ans = tilingProblem(15);
        System.out.println(ans);
    }
}