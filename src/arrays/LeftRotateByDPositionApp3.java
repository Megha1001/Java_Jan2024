package arrays;
/*
NOt in place
TIME COMPLEXITY : O(N)
AUXILIARY SPACE : O(1)
 */
public class LeftRotateByDPositionApp3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int d = 3;
        lRotateByD(arr, d);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void lRotateByD(int arr[], int d){
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    public static void reverse(int arr[], int low, int high){
        int temp;
        while(low < high){
            //swap low and high
            temp = arr[low];
            arr[low]= arr[high];
            arr[high]=temp;
            ++low;
            --high;
        }
    }
}
