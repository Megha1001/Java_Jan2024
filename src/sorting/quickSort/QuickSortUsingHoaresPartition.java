package sorting.quickSort;

public class QuickSortUsingHoaresPartition {
    public static void main(String args[]){
        int [] arr = {8,4,7,9,3,10,5};
        System.out.print("Array after sorting is :");
        quickSort(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void quickSort(int arr[], int l, int h){
        if(l < h){
            int p = partition(arr, l, h);
            quickSort(arr, l , p);// have to include p as in hoares partition pivot might not be at its correct position
            quickSort(arr, p+1, h);
        }

    }

    public static int partition(int arr[], int l, int h){
        int i = l-1;
        int j = h+1;
        int pivot = arr[l];
        while(true){
            do{
                ++i;
            }while(arr[i] < pivot);

            do{
                --j;
            }while(arr[j]>pivot);

            if(i >= j){
                return j;
            }

            //swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }
}
