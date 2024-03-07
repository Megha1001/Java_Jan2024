/*
TIME COMPLEXITY : O(N)
*/
class Insertion {
    public static void main(String[] args) {
        int inputArr[] = new int[5], cap=5, n=3;
        inputArr[0]=3; inputArr[1]=6; inputArr[2]=0;
        System.out.println("Before insertion");
        for(int i=0; i<n; i++){
            System.out.print(inputArr[i]+" ");
        }
        
        int x = 4;
        int pos = 2;
        
        n= insert(inputArr, n, cap, x, pos);

        System.out.println("\nAfter insertion");
        for(int i=0; i<n; i++){
            System.out.print(inputArr[i]+" ");
        }
    }
    
    public static int insert(int[] arr, int n, int cap, int x, int pos){
        //capacity is full, return as it is array -> DON'T INSERT
        if(n == cap){
            return n;
        }
        
        int index = pos-1;
        for(int i=n-1; i>=index; --i){
            arr[i+1] = arr[i];
        }
        arr[index]=x;
        
        return n+1;
    }
}
