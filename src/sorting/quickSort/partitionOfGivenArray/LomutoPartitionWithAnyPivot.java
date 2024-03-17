package sorting.quickSort.partitionOfGivenArray;
/*
 * Considering pivot as last element
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(1)
 * 
 * IDEA : SWAP the PIVOT WITH LAST ELEMENT
 */
public class LomutoPartitionWithAnyPivot {
    public static void main(String []args){
        int arr[] = {3,8,6,12,10,7};
        int pivot = 3; //1-indexed

        //swap pivot with last element
        
        int temp = arr[pivot-1];
        arr[pivot-1] = arr[arr.length-1];
        arr[arr.length-1] = temp;

        System.out.println("Array element after partition are :");
        int pivotFinalIndex = partitionArray(arr, 0, arr.length-1);
        System.out.println("The index of pivot :"+pivotFinalIndex);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int partitionArray(int arr[], int l, int h){
        int pivot = arr[h];
        int i = l-1;

        for(int j=0; j<=h-1; j++){

            if(arr[j] < pivot){
                ++i;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }

        //swap
        int temp = arr[i+1];
        arr[i+1] = arr[h]; // pivot
        arr[h] = temp;

        return i+1;
    }
}
