package arrays;

/*
TIME COMPLEXITY : O(N)
DISCLAIMER : Print leaders from right to left
 */
public class EffLeaderInArray {
    public static void main(String[] args) {
        int arr[] = {7,10,4,10,6,5,2};
        System.out.println("Leaders of the array are :");
        findAndPrintLeaders(arr);
    }

    public static void findAndPrintLeaders(int arr[]){
        int currLeader = arr[arr.length-1];
        System.out.print(currLeader+" ");
        for(int i= arr.length-2; i>=0; i--){
            if(currLeader < arr[i]){
                currLeader = arr[i];
                System.out.print(currLeader+" ");
            }
        }
    }
}
