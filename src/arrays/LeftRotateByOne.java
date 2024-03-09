package arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int arr[] ={1,4,6,7,8,8};
        System.out.println("Array after left rotation by 1");
        lRotateByOne(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void lRotateByOne(int arr[]){
        int temp = arr[0];
        for(int i=0; i<arr.length-2; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }
}
