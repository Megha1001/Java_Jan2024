package searching.searchInInfiniteSizedArray;

public class UnBoundedBinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 40, 50};
        int x = 3;
        System.out.println(search(arr, x));
    }

    public static int search(int arr[], int x){

        if(arr[0]==x){
            return 0;
        }

        int i = 1;
        while(arr[i] < x){
            i = i*2;
        }
        //either arr[i] ==x or arr[i] > x
        if(arr[i]==x){
            return i;
        }
        return binarySearch(arr, (i/2)+1, i-1, x);
    }

    public static int binarySearch(int arr[], int l, int h, int x){
        while (l <= h){
            int m = (l+h)/2;
            if(arr[m]==x){
                return m;
            }else if(arr[m] > x){
                h = m-1;
            }else{
                l = m+1;
            }
        }
        return -1;
    }
}
