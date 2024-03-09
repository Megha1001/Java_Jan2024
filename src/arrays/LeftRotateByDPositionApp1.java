package arrays;
/*
NOt in place
TIME COMPLEXITY : O(N)
AUXILIARY SPACE : O(D)
 */
public class LeftRotateByDPositionApp1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int d = 3;
        lRotateByD(arr, d);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void lRotateByD(int arr[], int d){
        for(int i=0; i<d; i++){
            lRotateByOne(arr);
        }
    }

    public static void lRotateByOne(int arr[]){
        int temp = arr[0];
        for(int i=0; i<=arr.length-2; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }
}
