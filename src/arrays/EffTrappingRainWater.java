package arrays;

/*
TIME COMPLEXITY : O(N)
Not in-place approach
 */
public class EffTrappingRainWater {
    public static void main(String[] args) {
//        int arr[] = {3,0,1,2,5};
        int arr[] = {3,3,3,3,3};
        System.out.println("Total amount of trapping water is "+calTrappingWater(arr));
    }

    public static int calTrappingWater(int arr[]){
        int res =0;
        int length = arr.length;
        int lMax[] = new int[length];
        int rMax[] = new int[length];

        //calculate left max
        lMax[0] = arr[0];
        for(int i=1; i<length;i++){
            lMax[i] = Math.max(arr[i],lMax[i-1]);
        }

        //calculate right max
        rMax[length-1] = arr[length-1];
        for(int i=length-2; i>=0; i--){
            rMax[i] = Math.max(arr[i],rMax[i+1]);
        }

        for(int i=1; i<length-1; i++){
            res += Math.min(lMax[i],rMax[i]) - arr[i];
        }
        return res;
    }
}
