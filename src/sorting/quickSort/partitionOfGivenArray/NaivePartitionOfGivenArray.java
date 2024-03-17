package sorting.quickSort.partitionOfGivenArray;

public class NaivePartitionOfGivenArray {

    public static void main(String []args){
        int arr[] = {3,8,6,12,10,7};
        int pivot = 5;

        System.out.println("Array element after partition are :");
        arr = partitionArray(arr, pivot);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] partitionArray(int arr[], int pivot){

        int n = arr.length;
        int temp[] = new int[n];
        int element = arr[pivot];

        //copy <= element to temp
        int i=0;
        int count=0;
        for(i=0; i<n; i++){
            if(arr[i]<= element){
                temp[count]= arr[i];
                ++count;
            }
        }


        //copy > element to temp
        for(int j=0; j<n; j++){
            if(arr[j] >  element){
                temp[count]= arr[j];
                ++count;
            }
        }
        return temp;
    }
    
}
