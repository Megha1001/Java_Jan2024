package sorting;

public class RadixSort {
    public static void main(String[] args) {
        int arr[] = {319,212,6,8,100,50};
        System.out.println("array after sorting is ");
        radixSort(arr, arr.length);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void radixSort(int arr[], int n){
        //find max
        int max = arr[0];
        for(int i=1; i<n; i++){
            max = Math.max(max, arr[i]);
        }

        //call counting sort for every bit postion
        for(int exp = 1; (max)/exp >0; exp=exp*10){
            countingSort(arr, n, exp);
        }
    }

    public static void countingSort(int arr[], int n, int exp){
        int count[] = new int[10], output []= new int[n];

        for(int i=0; i<10; i++){
            count[i] = 0;
        }

        for(int i=0; i<n; i++){
            count[(arr[i]/exp) %10]++;
        }

        for(int i=1; i<10; i++){
            count[i] = count[i] + count[i-1];
        }

        for(int i=n-1; i>=0; i--){
            output[count[(arr[i]/exp)%10] - 1] = arr[i];
            count[(arr[i]/exp)%10] --;

        }

        for(int i=0; i<n; i++){
            arr[i] = output[i];
        }
    }
}
