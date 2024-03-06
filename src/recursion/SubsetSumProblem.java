package recursion;

public class SubsetSumProblem {
    public static void main(String[] args) {
        int arr[] = {10,20,15};
        int sum = 25;

        System.out.println("Number of subsets that has sum="+sum+" is/are : "+countSubsets(arr,arr.length, sum));
    }

    public static int countSubsets(int[] arr, int n, int sum){
        if(n==0){
            return sum == 0 ?1 :0;
        }

        return countSubsets(arr, n-1,sum) //not considering n-1 element
                + //sum the number of subsets that has sum from left sub tree and right sub tree
                countSubsets(arr, n-1, sum - arr[n-1]); // considering n-1 element
    }
}
