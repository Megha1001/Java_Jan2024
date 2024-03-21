package sorting.countingSort;

/*
 * TIME COMPLEXITY : O(N+K)
 * 
 * ISSUES : Cannot be used as a general purpose algorithm for sorting objects with multiple members, like sorting an array of
 * students by marks
 */
public class NaiveCoutingSort {

    public static void main(String args[]){
        int arr[] = {1,4,4,1,0,1};
        int k = 5; //elements are from 0 to k-1
        System.out.println("Array after sorting is ");
        countSort(arr, k);

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void countSort(int [] arr, int k){
        int count[] = new int[k]; //element maintaining values from 0 to K-1;

        //O(K)
        for(int i=0; i<k; i++){
            //intialize
            count[i] = 0;
        }

        //O(K)
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //O(N)
        int index = 0;
        for(int i=0; i<k; i++){
            for(int j=0; j <count[i]; j++){
                arr[index] = i;
                ++index;
            }
        }
    }
    
}
