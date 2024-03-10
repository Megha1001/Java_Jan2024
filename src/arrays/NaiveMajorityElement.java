package arrays;
/*
TIME COMPLEXITY : O(N*N)
 */
public class NaiveMajorityElement {
    public static void main(String[] args) {
        int arr[]={8,7,6,8,6,6,6,6};
        System.out.println("Count of majority element is : "+countMajorityElement(arr));
    }

    public static int countMajorityElement(int[] arr){
        int res =-1;
        int n = arr.length;

        for(int i=0; i<n; i++){
            int count=1;
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    ++count;
                }
            }

            if(count > n/2){
                return i;
            }
        }

        return res;
    }
}
