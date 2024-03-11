package searching.firstOccurrence;

/*
TIME COMPLEXITY : O(N)
 */
public class NaiveSolution {
    public static void main(String[] args) {
        int arr[] = {5,10,15,20,20,20};
        int searchItem = 20;
        System.out.println("Index of first occurrence of search item is "+findIndex(arr,searchItem));
    }

    public static int findIndex(int arr[], int searchItem){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==searchItem){
                return i;
            }
        }
        return -1;
    }
}
