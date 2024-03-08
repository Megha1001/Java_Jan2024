package arrays;

/*
Not in-place solution
TIME COMPLEXITY : O(N)
AUX SPACE COMPLEXITY : O(N)
 */
public class NaiveRemovingDuplicatesInSortedArray {
    public static void main(String[] args) {
//        int arr[] = {1,7,3,9,0,1,0,7};
        int arr[] = {1,1,1,2,2,3,4};
        System.out.println("Before removing duplicates");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nAfter removing duplicates");
        int newArr[] = new int[arr.length];
        int newIndex = removeDuplicates(arr, newArr);
        for(int i=0; i<=newIndex; i++){
            System.out.print(newArr[i]+" ");
        }
    }

    public static int removeDuplicates(int arr[], int newArr[]){
        newArr[0] = arr[0];
        int newIndex = 0; // to what index we have to insert in new Array
        for(int i = 1; i< newArr.length; i++){
            if(newArr[newIndex] !=arr[i]){
                ++newIndex;
                newArr[newIndex] = arr[i];
            }
        }
        return newIndex;
    }
}
