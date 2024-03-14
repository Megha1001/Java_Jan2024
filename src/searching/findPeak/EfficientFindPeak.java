package searching.findPeak;

/*
 * A peak element is an element whose neighbours have value smaller than that of the element
 * TIME COMPLEXITY : O(logN)
 */

public class EfficientFindPeak{
    public static void main(String [] args){
        int arr[] = {5,20,40,30,20,50,60};
        System.out.println("The peak element in given array is :"+findPeak(arr, 0, arr.length-1));
    }

    public static int findPeak(int arr[], int l, int h){

        while(l <= h){
            int m = (l+h)/2;

            //check for middle and first and last element
            if((m==0 || arr[m]>=arr[m-1]) && (m==arr.length-1 || arr[m]>=arr[m+1])){
                return m;
            }

            //go to left
            if(m > 0 && arr[m] <= arr[m-1]){
                h = m-1;
            }else{
                l = m+1;
            }
        }

        return -1;
    }
}
