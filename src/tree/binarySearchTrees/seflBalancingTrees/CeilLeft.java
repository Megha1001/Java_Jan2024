package tree.binarySearchTrees.seflBalancingTrees;

/*
TIME COMPLEXITY : O(N^2)
 */
public class CeilLeft {
    public static void main(String[] args) {
        int arr[] ={2,8,30,15,25,12};
        System.out.println(" The ceil on left side of every element is : ");
        findCeil(arr);
    }

    public static void findCeil(int [] arr){

        //for first element
        System.out.print("-1 ");

        for(int i=1;i<arr.length; i++){
            int ceil = Integer.MAX_VALUE;
            for(int j=i-1; j>=0;j--){
                if(arr[j] >= arr[i]){
                    ceil = Math.min(ceil, arr[j]);
                }
            }

            if(ceil == Integer.MAX_VALUE){
                System.out.print("-1 ");
            }else{
                System.out.print(ceil+" ");
            }
        }

    }
}
