package arrays;
/*
TIME COMPLEXITY : O(N*N)
 */
public class NaiveMaximumConsecutiveOne {
    public static void main(String[] args) {
        int arr[] ={1,0,1,1,1,0,0,1,1,1,1,0};
        System.out.println("The maximum number of consecutive 1's is "+countConsecutiveOne(arr));
    }

    public static int countConsecutiveOne(int arr[]){
        int res =0;
        int len = arr.length;
        for(int i=0; i<len; i++){
            int count=0;
            for(int j=i; j<len; j++){
                if(arr[j]!=0){
                    count++;
                }else{
                    break;
                }
            }
            res = Math.max(count, res);
        }
        return res;
    }
}
