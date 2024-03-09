package arrays;

public class MoveZeroesToEndApp2 {
    public static void main(String[] args) {
//        int arr[] ={8,5,0,1,0,0,0};
        int arr[] ={0,0,0,0,1,2,3,0};
        System.out.println("Array after moving all zeroes to end");
        moveZeroesToEnd(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void moveZeroesToEnd(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int temp;
            if(arr[i]!=0){
                //swap
                temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                ++count;
            }
        }
    }
}
