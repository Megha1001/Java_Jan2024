package arrays;
/*
TIME COMPLEXITY : O(N)
 */
public class EffMaximumConsecutiveOne {
    public static void main(String[] args) {
        int arr[] ={1,0,1,1,1,0,0,1,1,1,1,0};
        System.out.println("The maximum number of consecutive 1's is "+countConsecutiveOne(arr));
    }

    public static int countConsecutiveOne(int arr[]){
        int res =0;
        int countOne = 0;
        for(int i=0; i< arr.length;i++){
            if(arr[i]==0){
                countOne =0;//found 0, reset the count
            }else{
                //found 1
                ++countOne;
                res = Math.max(res, countOne);
            }
        }
        return res;
    }
}
