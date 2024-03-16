package sorting.mergeSort;

/*
 * TIME COMPLEXITY : Theta(N*LogN) ; LogN levels and at every level we are doing Theta(N) work
 * AUX SPACE : Theta(N) : for every level during merge call we are using Theta(N) aux space but at any moment we need Theta(N). Hence, its not Theta(N*LogN)
 */
public class MergeSortAlgorithm {

    public static void main(String []args){
        int arr[] = {10,5,13,15,7};
        int n = arr.length;
        System.out.println("Elements after sorting from merge sort are :");
        mergeSort(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(int arr[], int l, int r){

        if(r>l){
            //calculate mid
            int m = l +(r-l)/2; // to handle overflow

            //for left half
            mergeSort(arr, l, m);
            //for right half
            mergeSort(arr, m+1, r);

            merge(arr, l, m, r);
        }

    }

    public static void merge(int arr[], int l, int m, int h){

        int n1 = m-l+1; //for left sub array
        int n2 = h-m; //for right sub array

        //declare temp arrays
        int left[] = new int[n1];
        int right[] = new int[n2];

        //populate left array
        for(int i=0; i<n1; i++){
            left[i] = arr[i+l]; //why adding l , since its offset. it wouldn't always be zero.
        }

        //populate right array
        for(int i=0; i<n2; i++){
            right[i] = arr[i+m+1]; //m+1 is the offset
        }

        //reference for left, right and original array
        int i = 0;
        int j = 0;

        int k = l; // l if offset of original array and it wouldn't always be zero.


        while(i<n1 && j <n2){
            //consider left
            if(left[i] <= right[j]){ // = is to maintain stability
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }

        //copying remaning element of n1 if any
        while(i<n1){
            arr[k++] = left[i++];
        }

        //copying remaning element of n2 if any
        while(j<n2){
            arr[k++] = right[j++];
        }

    }
    
}
