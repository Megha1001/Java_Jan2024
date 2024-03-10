package arrays;

public class NaivePrefixSum {
    public static int arr[] ={2,8,3,9,6,5,4};
    public static void main(String[] args) {
        System.out.println(getSum(0,2));
    }

    public static int getSum(int l, int r){
        int res=0;
        for(int i=l; i<=r;i++){
            res += arr[i];
        }
        return res;
    }
}
