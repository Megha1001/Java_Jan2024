package searching.firstOccurrence;

/*

 */
public class RecursiveBinarySearchFindFirstOccApp {
    public static void main(String[] args) {
        int arr[] = {15,15,15,20,20,20};
        int searchItem = 15;
        System.out.println("Index of first occurrence of search item is "+findIndex(arr,0, arr.length-1, searchItem));
    }

    public static int findIndex(int arr[], int l, int h, int x){
        //base condition
        if(l>h){
            return -1;
        }
        int m = (l+h)/2;
        if(arr[m]==x){
            /*
            check whether this occurrence is first or not - using short-circuiting to prevent from
            corner cases like 15,15,15 when we reach for index 0 we should not be doing 0-1=-1
            */
            if(m==0 || (arr[m] != arr[m-1])){ //-> if passes, means first occurrence
                return m;
            }
            //not a first occurrence
            return findIndex(arr, l, m-1, x);
        }
        else if(arr[m] > x){ //search on left of array
            return findIndex(arr, l, m-1, x);
        }
        return findIndex(arr, m+1, h, x);

    }
}
