package arrays;
class EfficientAppSecondLargest{
    public static void main(String [] args){
        int arr[] = {3,5,6,0,-1,4,8,10,19};
        int indexSecondLargest = findSecondLargest(arr);
        System.out.println("The second largest in given array is "+(indexSecondLargest!=-1?arr[indexSecondLargest]: "Not present"));
    }
    
    public static int findSecondLargest(int arr[]){
        int res = -1;
        int largest = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > arr[largest]){
                res = largest;
                largest = i;
            }else if(arr[i] < arr[largest] && (res == -1 || arr[res] < arr[i])){
               res = i;
            }
        }
        return res;
    }
}
