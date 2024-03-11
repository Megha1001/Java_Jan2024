package searching;
/*
TIME COMPLEXITY : O(logN)
AUX SPACE :O(1)
 */
public class LinearBinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int searchItem = 50;
        System.out.println(searchItem +" is present at index :"+findIndex(arr,searchItem));
    }


    public static int findIndex(int arr[], int searchItem){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int mid = -1;

        while(low <= high){ // if it drills down to single values it should check that too hence including = (in given example if we want to search for 20)
            mid = (low +high)/2;
            if(arr[mid] == searchItem){
                return mid;
            }else if(arr[mid] > searchItem){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return -1; //not found
    }
}
