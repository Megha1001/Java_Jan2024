package searching.sortedRotatedArray;
/*
TIME COMPLEXITY : O(logN)

CONCEPT :
Sorted rotated array : one of the half must be sorted
1. identify which half is sorted , by comparing mid with any of the corners  and mid element
2. compare the search element lies b/w sorted half if yes go there otherwise go to the other half
 */
public class BinarySearchSolution {
    public static void main(String[] args) {
        /*int arr[] = {10,20,30,40,50,8,9};
        int x = 30;*/
/*        int arr[] = {100, 200, 300, 10, 20};
        int x = 40;*/
      /*  int arr[] = {100, 200, 300, 10, 20};
        int x = 100;*/;

        int arr[] = {100, 200, 300, 400, 20, 30, 40};
        int x = 50;
        System.out.println("the index of the search element is : "+search(arr, 0, arr.length - 1, x));
    }

    public static int search(int arr[], int l, int h, int x){

        while(l <= h){
            int m = (l+h)/2;

            //check for middle
            if(arr[m] == x){
                return m;
            }

            //check which part is sorted - is it left ?
            if(arr[m] >= arr[l]){ //left half is sorted
                // is x lies b/w them ?
                if(x < arr[m] && x>=arr[l]){
                    //go to left
                    h = m - 1;
                }else{
                    // go to right
                    l = m + 1;
                }
            }else if (arr[m] <= arr[h]){//check which part is sorted - is it right ?
                // is x lies b/w them ?
                if(x > arr[m] && x <= arr[h]){
                    l = m + 1;
                }else{
                   //go to left
                    h = m - 1;
                }
            }
        }
        return -1;
    }
}
