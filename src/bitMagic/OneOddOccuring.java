package bitMagic;

public class OneOddOccuring {
    public static void main(String[] args) {
        int n[] = {4,3,4,4,4,5,5,3,7};
        System.out.println("The one odd occuring number is :"+findOneOddOccurNaive(n));
    }

    public static int findOneOddOccurNaive(int[] n){
        for(int i=0; i< n.length; i++){
            int temp = n[i];
            int res = 0;
            for(int j=0; j < n.length; j++){
                if(temp == n[j]){
                    ++res;
                }
            }
            if(res%2 !=0){
                return n[i];
            }
        }
        return -1;
    }
}
