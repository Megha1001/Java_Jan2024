package sorting.quickSort.partitionOfGivenArray;
/*
 * TIME COMPLEXITY : O(N)
 * AUX SPACE : O(N)
 */
public class NaivePartition {

    public static void main(String []args){
        int arr[] = {3,8,6,12,10,7};
        int pivot = 5;

        System.out.println("Array element after partition are :");
        partitionArray(arr, 0, arr.length-1, pivot);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void partitionArray(int arr[], int l, int h, int pivot){

        int temp[] = new int[h-l+1];
        int element = arr[pivot];

        //copy <= element to temp
        int index=0;
        for(int i=l; i<=h; i++){
            if(arr[i]<= element){
                temp[index]= arr[i];
                ++index;
            }
        }


        //copy > element to temp
        for(int j=l; j<=h; j++){
            if(arr[j] >  element){
                temp[index]= arr[j];
                ++index;
            }
        }
       
        //copy to original array
        for(int i=l; i<=h; i++){
            arr[i] = temp[i-l];
        }
    }
    
}
