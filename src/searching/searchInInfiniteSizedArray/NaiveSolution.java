package searching.searchInInfiniteSizedArray;
/*
TIME COMPLEXITY :O(Positon Of Element)
 */
public class NaiveSolution {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 5};
        int x = 4;
        System.out.println(search(arr, x));
    }

    public static int search(int arr[], int x){
        int i=0;
        while(true){
            if(x == arr[i]) return i;
            else if(x < arr[i]) return -1; //not present
            ++i
        }
    }
}
