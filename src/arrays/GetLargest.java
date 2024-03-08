/*
TIME COMPLEXITY : O(N)
*/
package arrays;
class GetLargest {

    public static void main(String[] args) {
        int arr[]= {1,2,5,7,3,0,9};
        
        System.out.println("Get largetst -> "+getLargest(arr));
       
    }
    
    public static int getLargest(int arr[]){
        int res = arr[0];
        for(int i=1; i < arr.length; i++){
            if(arr[i] > res){
                res = arr[i];
            }
        }
        
        return res;
    }

}
