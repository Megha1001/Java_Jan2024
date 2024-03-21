package sorting.countingSort;

public class EfficientCountingSort {

    public static void main(String args[]){
        int arr[] = {1,4,4,1,0,1};
        int k = 5; //elements are from 0 to k-1
        System.out.println("Array after sorting is ");
        countSort(arr, k);

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void countSort(int[]arr, int k){
        int count[] = new int[k];
        int n = arr.length;

        for(int i=0; i<k ;i++){
            count[i] = 0;
        }

        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }

        //current element indicate how many elements <= present element
        for(int i=1; i<k; i++){
            count[i] = count[i-1] + count[i];
        }

        int temp[] = new int[n];

        for(int i=n-1; i>0; i--){ //starting from last to maintain stability
            temp[count[arr[i]]-1] = arr[i];//index is 0 based hence -1
            count[arr[i]]--; //sinxe we fix the position of arr[i] element hence need to decrease the count by 1
        }

        //copy the temp to original
        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }

    }
}
