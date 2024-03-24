package hashing.countDistinct;

public class NaiveSolutionCountDistinct {
    public static void main(String args[]){
        int arr[] ={10,20,10,20,30};
        System.out.println("Number of distinct elements in given array is "+countDistinct(arr));
    }

    public static int countDistinct(int arr[]){
        int res = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            boolean flag = false;
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                ++res;
            }
        }
        return res;
    }
}
