package arrays;

/*
TIME COMPLEXITY : O(N^2)
 */
public class NaiveLeaderInArray {
    public static void main(String[] args) {
        int arr[] = {7,10,4,10,6,5,2};
        System.out.println("Leaders of the array are :");
        findAndPrintLeaders(arr);
    }

    public static void findAndPrintLeaders(int arr[]){
        for(int i=0; i<arr.length; i++){
            boolean flag = false;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] <= arr[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
