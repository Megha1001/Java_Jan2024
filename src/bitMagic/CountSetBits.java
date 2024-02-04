package bitMagic;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 13;
        System.out.println("Num of set bits are : "+countSetBits(n));
        System.out.println("Num of set bits are : "+countSetBits(n));
        System.out.println("Num of set bits are : "+countBitEfficient(n));
    }
    //Bitwise is faster than %2 operator
    //TIME COMPLEXITY : θ(d) -> where d is number of bits from LSB to MSB
    public static int countSetBits(int n){
        int res = 0;
        while(n != 0){
            if((n &1) !=0){
                ++res;
            }
            n = n>>1;
        }
        return res;
    }

    public static int countSetBitsNaive(int n){
        int res = 0;
        while(n != 0){
            /*if(n%2 != 0){
                ++res;
            }*/
            res += (n&1);
            n = n/2;
        }
        return res;
    }

    //Efficient algo -> runs only number of set bits times
    //Brian and Kerningham Algorithm
    /*
     We'll make the last set bit as 0. n = n& (n-1)
     TIME COMPLEXITY : θ(Num of set bits)
     */
    public static int countBitEfficient(int n){
        int res = 0;
        while(n > 0){
            ++res;
            n = n & (n-1);
            /*when we - 1 from number all trailing zeroes become 1 and the first 1 from LHS
            becomes zero
            b : 40 : 101000
                39 : 100111
            */
        }
        return res;
    }
}
