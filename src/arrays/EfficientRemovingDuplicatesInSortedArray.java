package arrays;
/*
in-place solution
TIME COMPLEXITY : O(N)
AUX SPACE COMPLEXITY : O(1)
 */
public class EfficientRemovingDuplicatesInSortedArray {
    public static void main(String[] args) {
//        int arr[] = {1,7,3,9,0,1,0,7};
        int arr[] = {1,1,1,2,2,3,4};
        System.out.println("Before removing duplicates");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nAfter removing duplicates");
        int newIndex = removeDuplicates(arr);
        for(int i=0; i<newIndex; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int removeDuplicates(int arr[]){
        int res = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[res-1] != arr[i]){
                arr[res] = arr[i];
                ++res;
            }
        }
        return res;
    }
}
