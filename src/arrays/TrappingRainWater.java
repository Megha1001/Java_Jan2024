package arrays;

/*
TIME COMPLEXITY : O(N^2)
In-place approach
 */
public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[] = {3,0,1,2,5};
        System.out.println("Total amount of trapping water is "+calTrappingWater(arr));
    }

    public static int calTrappingWater(int arr[]){
        int res = 0;
        for(int i=1; i<arr.length-1; i++){
           int lMax = arr[i];
           for(int j=0; j<i; j++){
               lMax = Math.max(arr[j],lMax);
           }
           int rMax = arr[i];
           for(int j=i+1; j<arr.length; j++){
               rMax = Math.max(arr[j],rMax);
           }
           res += Math.min(lMax,rMax)-arr[i];
        }
        return res;
    }
}
