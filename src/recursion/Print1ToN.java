package recursion;

public class Print1ToN {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Print numbers from 1 to "+n);
        printNum(n);
    }
    /*
    TIME COMPLEXITY : θ(N)
    AUXILIARY SPACE : θ(N)
     */
    public static void printNum(int n ){
        //base case
        if(n==0){
            return;
        }
        printNum(n-1);
        System.out.print(n+" ");
    }
}
