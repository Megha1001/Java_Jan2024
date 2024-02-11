package recursion;

public class SumOfNNaturalNum {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Sum of first "+n+" natural number is "+sumOfFirstNNum(n));
    }

    /*
    TIME COMPLEXITY : θ(N)
    AUXILIARY SPACE : θ(N)
    */
    public static int sumOfFirstNNum(int n){
        //base case
        if(n==0){
            return 0;
        }
        return n +sumOfFirstNNum(n-1);
    }
}
