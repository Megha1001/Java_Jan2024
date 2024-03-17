package sorting.quickSort.partitionOfGivenArray;

/*
 * Considering pivot as last element
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(1)
 */
public class LomutoPartition {

    public static void main(String []args){
        int arr[] = {3,8,6,12,10,7};

        System.out.println("Array element after partition are :");
        int pivotFinalIndex = partitionArray(arr, 0, arr.length-1);
        System.out.println("The index of pivot :"+pivotFinalIndex);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int partitionArray(int arr[], int l, int h){
        int pivot = arr[h];
        int i = l-1; //track of smaller elements

        for(int j=l; j<=h-1; j++){
            
            if(arr[j]< pivot){
                //make space for small element than pivot
                ++i;
                //swap arr[i] with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

        //swap pivot with i+1
        int temp = arr[i+1];
        arr[i+1] = pivot;
        arr[h] = temp;

        return i+1;

    }
    
}
