package arrays;

public class NaiveMaxDifferenceProblem {
    public static void main(String[] args) {
        int arr[] = {2,3,10,6,4,8,1};
        System.out.println("Maximum difference b/w two pairs is "+getMaxDiff(arr));
    }
    
    public static int getMaxDiff(int arr[]){
        int res = arr[1]-arr[0];
        for(int i=0; i<arr.length - 1; i++){ //NO need to do this for last element.
            for(int j=i+1; j<arr.length; j++){
                res = Math.max(res, arr[j]-arr[i]);
            }
        }
        return res;
    }
}
