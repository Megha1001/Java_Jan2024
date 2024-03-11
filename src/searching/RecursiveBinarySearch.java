package searching;
/*
TIME COMPLEXITY : O(logN)
AUX SPACE :O(logN)
overhead of recursive func call
 */
public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int searchItem = 50;
        int h = arr.length-1;
        System.out.println(searchItem +" is present at index :"+findIndex(arr,0, h,searchItem));
    }


    public static int findIndex(int arr[], int low, int high, int searchItem){
        if(low > high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid]==searchItem){
            return mid;
        }
        else if(arr[mid] > searchItem){
            return  findIndex(arr, low , mid-1, searchItem);
        }

        return  findIndex(arr, mid+1, high, searchItem);
    }
}
