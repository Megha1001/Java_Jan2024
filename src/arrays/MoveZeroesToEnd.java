package arrays;

public class MoveZeroesToEnd {
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
        int low = 0;
        int high = arr.length-1;
        int temp;
        while(low < high){
            if(arr[low]!=0){
                ++low;
            }
            if(arr[high]==0){
                --high;
            }

            if(arr[low]==0 && arr[high]!=0){
                //swap
                temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                ++low;
                --high;
            }
        }
    }
}
