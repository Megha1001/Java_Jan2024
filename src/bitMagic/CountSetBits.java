package bitMagic;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 13;
        System.out.println("Num of set bits are : "+countSetBits(n));
        System.out.println("Num of set bits are : "+countSetBitsNaive(n));
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
            if(n%2 != 0){
                ++res;
            }
            n = n/2;
        }
        return res;
    }
}
