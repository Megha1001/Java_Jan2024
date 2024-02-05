package bitMagic;

public class PowerOf2 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(n+" is power of 2 ? "+checkPowOf2Naive(n));
        System.out.println(n+" is power of 2 ? "+brianKerningham(n));
    }
    //TIME COMPLEXITY : O(N)
    public static boolean checkPowOf2Naive(int n){
        if(n == 0){
            return false;
        }
        while(n != 1){
            if(n%2 !=0){
                return false;
            }
            n = n/2;
        }
        return (n==1)? true :false;
    }

    /*
    Binary representation of power of 2 have only one set bit
    If count set bits is 1 return true else return false
    TIME COMPLEXITY : O(1)
     */

    public static boolean brianKerningham(int n){
       /* if(n==0){
            return false;
        }*/
//        return (n&(n-1)) == 0;
        return (n & (n&(n-1))) == 0; //handles n=0 as
    }
}
