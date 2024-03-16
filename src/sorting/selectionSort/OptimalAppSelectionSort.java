package sorting.selectionSort;

/*
 * TIME COMPLEXITY : O(N^2)
 */
public class OptimalAppSelectionSort {
    public static void main(String[] args) {
        int arr[] = {10,5,8,20,2,18};
        System.out.println("Array after sorting is :");
        selectionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){ //No need to run for last element as it would always be largest after the programs run for n-1 elements
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }

            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        
    }
    
}
