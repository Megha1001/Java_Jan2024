package bitMagic;

public class CheckKthBit {
    public static void main(String[] args) {
        int n = 5;
        int k = 1;
        System.out.println("is "+k+"th bit of "+n+" is set ?"+checkKthBitNaiveSolution(n,k));
        System.out.println("is "+k+"th bit of "+n+" is set ?"+checkKthBitNaiveSolution2(n,k));
        System.out.println("is "+k+"th bit of "+n+" is set ?"+checkKthBit(n,k));
        System.out.println("is "+k+"th bit of "+n+" is set ?"+checkKthBitApp2(n,k));
    }
    /*
    Will make the num x = num formed by setting only that kth bit. That number would be 2^k-1, where we are considering LSB as 0th position
    1. Find 2^k-1
    2. do & with n
    3. if get ==1 -> kth bit is set, else not set

    TIME COMPLEXITY : Theta(k)
     */
    public static String checkKthBitNaiveSolution(int n, int k){
        int x = 1;
        for(int i = 0; i <(k-1); i++){
            x = x*2;
        }
        if((x&n)!=0){
            return "Yes";
        }
        return "No";
    }

    /*
   Take the Kth bit of num n to LSB
   1. do & with 1
   2. if get ==1 -> kth bit is set, else not set

   TIME COMPLEXITY : Theta(k)
    */
    public static String checkKthBitNaiveSolution2(int n, int k){
        int x = 1;
        for(int i = 0; i <(k-1); i++){
            x = x/2;
        }
        if((x&1)!=0){
            return "Yes";
        }
        return "No";
    }

    public static String checkKthBit(int n, int k){
        return ((n>>(k-1))&1)==1?"Yes":"No";
    }

    public static String checkKthBitApp2(int n, int k){
        return (n&(1<<(k-1)))==1?"Yes":"No";
    }

}
