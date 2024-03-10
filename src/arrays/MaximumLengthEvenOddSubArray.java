package arrays;

public class MaximumLengthEvenOddSubArray {
    public static void main(String[] args) {
        int arr[] = {10,12,14,7,8};
//        int arr[] = {7,10,13,14};
//        int arr[] = {10,12,8,4};
        System.out.println("Maximum length of even-odd/odd-even subarray is :"+findAndGetEvenOddSubArray(arr));
    }

    public static int findAndGetEvenOddSubArray(int []arr){
        int res = 1;

        int len = arr.length;

        //TIME COMPLEXITY : O(N*N)
        /*
        for(int i=0; i<len; i++){
            int count = 1;
            for(int j=i+1; j<len; j++){
                if((arr[j-1]%2==0 && arr[j]%2!=0)||(arr[j-1]%2!=0 && arr[j]%2==0)){ //even-odd || odd-even
                    ++count;
                    res = Math.max(count,res);
                }else{
                    count=1;
                }
            }
        }

        //TIME COMPLEXITY : O(N)
        */
        int count = 1;
        for(int i=1; i<len; i++){
            if((arr[i-1]%2==0 && arr[i]%2!=0)||(arr[i-1]%2!=0 && arr[i]%2==0)){ //even-odd || odd-even
                ++count;
                res = Math.max(count,res);
            }else{
                count=1;
            }
        }

        return res;
    }
}
