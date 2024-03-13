package searching.infiniteBinarySearch;
/*
TIME COMPLEXITY : o(logN)
AUX SPACE : O(logN)
*/

class NaiveSearchInInfiniteArray {
    public static void main(String[] args) {
        int arr[] ={10,10,20,20,20,30};
        int item = 20;
        System.out.println("The last occurrence of given element is :"+searchItem(arr, item));
    }
    
    public static int searchItem(int arr[], int x){
        int i = 0;
        while(true){
            if(x == arr[i]) return i;
            else if (x < arr[i]) return -1;
            ++i;
        }
    }
}
