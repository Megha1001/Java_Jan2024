package searching.firstOccurrence;

/*
TIME COMPLEXITY : O(logN)
AUX SPACE : O(1)
 */
public class IterativeBinarySearchFindFirstOccApp {
    public static void main(String[] args) {
        int arr[] = {15,15,15,20,20,20};
        int searchItem = 20;
        System.out.println("Index of first occurrence of search item is "+findIndex(arr,0, arr.length-1, searchItem));
    }

    public static int findIndex(int arr[], int l, int h, int x){
        while(l <= h){
         int m = (l+h)/2;
         if(arr[m] > x){ //go to left side of array
             h = m - 1;
         }else if(arr[m] < x){// go to right side of array
             l = m+1;
         }else{
             if(m==0 || arr[m]!=arr[m-1]){
                 return m;
             }
             h = m-1;
         }
        }
        return -1;
    }
}
