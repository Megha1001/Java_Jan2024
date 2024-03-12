package searching;

/*
TIME COMPLEXITY : O(LogN)
AUX SPACE : O(1)

Idea : Length - first occurence of 1
 */
public class CountOneInSortedBinaryArray {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,1,1};
        System.out.println("Number of 1's in given array is :"+countOne(arr, 0, arr.length-1));
    }

    public static int countOne(int arr[], int l, int h){

        while(l <= h){
            int m = (l+h)/2;

            if(arr[m] == 1){
                if(m==0 || arr[m-1] == 0){
                    //first occurence
                    return arr.length - m;
                }else{
                    //not first 1 -> move to left
                    h = m - 1;
                }
            }else{
                //mid=0; -> move to right
                l = m+1;
            }
        }

        return 0;
    }
}
