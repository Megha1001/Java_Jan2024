package hashing.longestSubArrayWithEqualNumOf0And1;

public class NaiveSolution {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 0, 1, 0, 1, 1, 1};
        System.out.println("The longest subarray with equal number of 0's and 1's is "+findLongestSubArrayWith0And1(arr));
    }

    public static int findLongestSubArrayWith0And1(int [] arr){
        int res = 0;
        for(int i=0; i<arr.length; i++){
            int c0 =0; //count 0's
            int c1 = 1; //count 1's

            for(int j=i; j<arr.length; j++){
                if(arr[j] == 0){
                    ++c0;
                }else{
                    ++c1;
                }

                if(c0==c1){
                    res = Math.max(res, c0+c1);
                }
            }
        }
        return res;
    }
}
