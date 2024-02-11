package recursion;

public class PrintNto1 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Printing number from "+n+" to 1.");
        printNum(n);
    }
    /*
    TIME COMPLEXITY : θ(N)
    AUXILIARY SPACE : θ(N)
     */

    public static void printNum(int n){
        System.out.print(n+" ");
        if(n==1){
            return;
        }
        printNum(n - 1);
    }

}
