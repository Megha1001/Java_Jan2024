/*
TIME COMPLEXITY : O(N)
*/
class Deletion {
    //Delete only first occurence of element
    public static void main(String[] args) {
        int arr[]= {1,2,5,7,3,0,9};
        int x = 2;
        System.out.println("Before deletion");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("After deletion");
        int newSize = deletionOperation(arr,x);
        for(int i=0; i< newSize; i++){
            System.out.print(arr[i]+" ");
        }
       
    }
    
    public static int deletionOperation(int arr[], int x){
        int n = arr.length;
        int i=0;
        for(i=0; i< n; i++){
            if(arr[i]==x){
                break; //found the element
            }
        }
        
        //not found the element
        if(i == n){
            return n;
        }

        //if element is last one will just simple return n-1
        if(i == n-1){
            return n-1;
        }
        
        //make the adjustment to position
        for(int j=i; j < n-1; j++){
            arr[j]= arr[j+1];
        }
        
        return n-1;
    }

}
