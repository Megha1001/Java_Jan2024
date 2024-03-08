/*
    TIME COMPLEXITY : O(N)
*/
class CheckSortedArray{
    public static void main(String [] args){
        int arr[] = {0,0,0,0};
        // int arr[] = {1,2,3,4,5};
        System.out.println("Is given array sorted ? "+isSorted(arr));
    }
    
    public static boolean isSorted(int arr[]){
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
