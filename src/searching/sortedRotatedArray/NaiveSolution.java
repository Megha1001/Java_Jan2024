package searching.sortedRotatedArray;
/*
TIME COMPLEXITY : O(N)
 */
public class NaiveSolution {
    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 10, 20};
        int x = 100;
        System.out.println("the index of the search element is : "+search(arr, x));
    }

    public static int search(int arr[], int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
