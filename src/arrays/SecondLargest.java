/*
TIME COMPLEXITY : O(N)
*/
class SecondLargest {

    public static void main(String[] args) {
        int arr[]= {1,2,5,7,3,0,9};
        
        System.out.println("Get second Largest -> "+getSecondLargest(arr));
       
    }
    
    public static int getSecondLargest(int arr[]){
        int max = arr[0];
        for(int i=1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int secondLargest = max!=arr[0] ? arr[0] : arr[1];
        for(int i=1; i < arr.length; i++){
            if((arr[i] > secondLargest) && (arr[i] != max)){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

}
