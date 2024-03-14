package searching.findPeak;

public class NaiveFindPeak{
    public static void main(String [] args){
        int arr[] = {5,20,40,30,20,40,10};
        System.out.println("The peak element in given array is :"+findPeak(arr));
    }

    public static int findPeak(int arr[]){
        int n = arr.length;
        //base cases
        //1. Single element array
        if(n==1){
            return arr[0];
        }

        //2. first element is peak
        if(arr[0] >= arr[1]){
            return arr[0];
        }

        //3. last element is peak
        if(arr[n-1] >= arr[n-2]){
            return arr[n-1];
        }

        //check for middle elements
        for(int i=1; i<n-1; i++){
            if((arr[i]>=arr[i+1]) && (arr[i]>=arr[i-1])){
                return arr[i];
            }
        }
        return -1;

    }
}
