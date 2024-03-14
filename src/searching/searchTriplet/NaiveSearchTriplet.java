package searching.searchTriplet;

public class NaiveSearchTriplet {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 8, 9, 20, 40};
        int x = 32;
        System.out.println("is the triplet exists with given item ? "+searchTriplet(arr, x));
    }

    public static boolean searchTriplet(int arr[], int x){
        int n = arr.length;
        for(int i=0 ; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k= j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
