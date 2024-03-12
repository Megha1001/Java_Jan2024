package searching.lastOccurrence;
/*
 TIME COMPLEXITY : O(logN)
 AUX SPACE : O(1)
 */
public class IterativeLastOccurrence {
    public static void main(String[] args) {
        int arr[] ={10,10,20,20,20,30};
        int item = 10;
        System.out.println("The last occurrence of given element is :"+lastOccurrence(arr, 0, arr.length-1, item));
    }

    public static int lastOccurrence(int arr[], int low, int high, int x){

        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                if(mid == arr.length-1 || arr[mid]!=arr[mid+1]){
                    return mid;
                }else{
                    low = mid+1;
                }
            }else if(arr[mid] > x){
                //go to left
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }

        return -1;
    }


}
