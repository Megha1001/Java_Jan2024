/*
TIME COMPLEXITY : O(N)
*/
package arrays;
class NaiveSecondLargest {

    public static void main(String[] args) {
        // int arr[]= {1,2,5,7,3,0,9};
        int arr[]= {10,10,10,10};
        System.out.println("Get second Largest -> "+getSecondLargest(arr));
       
    }
    
    public static int getSecondLargest(int arr[]){
        int max = arr[0];
        for(int i=1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int secondLargest = -1; //When all are same then -1
        for(int i=1; i < arr.length; i++){
            if((arr[i] > secondLargest) && (arr[i] != max)){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

}
