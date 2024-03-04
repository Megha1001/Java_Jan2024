package recursion;

/*
Time complexity : O(3^n)
 */
public class RopeCuttingProblem {
    public static void main(String[] args) {
        int n = 23;
        int a = 11;
        int b = 9;
        int c = 12;
        System.out.println("Max pieces obtain from cutting rope is : "+maxPieces(n, a, b, c));
    }

    public static int maxPieces(int n , int a, int b, int c){
        //base case
        if(n == 0){
            return 0;
        }
        if(n < 0){
            return -1;
        }

        int result = Math.max(Math.max(maxPieces(n-a, a, b, c), maxPieces(n-b, a, b, c)),maxPieces(n-c, a, b, c));

        // Invalid rope cutting, length becomes -ve
        if(result == -1){
            return -1;
        }
        return result + 1;
    }
}
