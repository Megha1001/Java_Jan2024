/*
TIME COMPLEXITY : o(logN)
AUX SPACE : O(logN)
*/
package searching.lastOccurrence;
class RecursiveLastOccurrence {
    public static void main(String[] args) {
        int arr[] ={10,10,20,20,20,30};
        int item = 20;
        System.out.println("The last occurrence of given element is :"+lastOccurrence(arr, 0,
        arr.length-1, item));
    }
    
    public static int lastOccurrence(int arr[], int low, int high, int item){
        if(low > high){
            return -1;
        }
        
        int mid = (low+high)/2;
        if(arr[mid]==item){
            if(mid == arr.length-1 || arr[mid] != arr[mid+1]){
                return mid;
            }else{
                return lastOccurrence(arr, mid+1, high, item);
            }
        }else if(arr[mid] > item){
            return lastOccurrence(arr, low, mid-1, item);
        }
        return lastOccurrence(arr, mid+1, high, item);
    }
}
