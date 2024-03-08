package arrays;

/*
TIME COMPLEXITY : O(n)
AUX SPACE : O(1)
 */
public class ReverseArray {
    public static void main(String[] args) {
//        int arr[] = {1,5,7,2,3,5}; //even length
        int arr[] = {1,5,7,2,4}; //odd length
        System.out.println("Before reversing");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nAfter reversing");
        reverseArray(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nAfter reversing from method 2");
        reverseArray2(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void reverseArray(int arr[]){
        int i = 0;
        int j = arr.length - 1;
        int temp;
        for(int k=0; k<arr.length/2; k++){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            ++i; --j;
        }
    }

    public static void reverseArray2(int arr[]){
        int low = 0;
        int high = arr.length-1;
        int temp;
        while(low < high){
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            ++low;
            --high;
        }
    }
}
