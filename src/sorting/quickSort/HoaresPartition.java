package sorting.quickSort;

public class HoaresPartition {

    public static void main(String []args){
        int arr[] = new int[]{5,3,8,4,2,7,1,10};

        System.out.println("Array element after partition are :");
        int pivotFinalIndex = partitionArray(arr, 0, arr.length-1);
        System.out.println("The index of pivot :"+pivotFinalIndex);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static int partitionArray(int arr[], int l, int h){
        int pivot = arr[l];

        int i = l-1;
        int j = h+1;

        while(true){
            do{
                ++i;
            }while(arr[i] < pivot);


            do{
                --j;
            }while(arr[j] > pivot);

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
