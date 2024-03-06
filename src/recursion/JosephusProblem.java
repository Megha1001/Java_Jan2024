package recursion;

public class JosephusProblem {
    /*
    TIME COMPLEXITY : O(N)
     */
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        System.out.println("The index of survivor is : "+findSurvivor(n,k));
    }

    //considering index to be started from 0, if needs to be done for starting at 1, just add 1 to the final answer
    public static int findSurvivor(int n, int k){
        if(n==1){
            return 0;
        }
        return (findSurvivor(n-1, k) +k)%n;
    }
}
