package searching;

public class SquareRoot {
    public static void main(String[] args) {
        int x = 159; // return = 13
        System.out.println("Square root of the number is "+findSqrt(x, 0, x));
    }

    public static int findSqrt(int x, int l, int h){
        int res = -1;
        while(l <= h){
            int m = (l+h)/2;
            int mSqr = m*m;
            if(mSqr == x){
                //perfect square
                return m;
            }else if(mSqr > x){
                //go to left
                h = m-1;
            }else{
                l = m+1;
                res = l; //in case of like 10 , it would not be perfect sqr and we should return 4
            }
        }
        return res;
    }
}
