package heap.kClosestElements;

/*
Approach :
1. Maintain a boolean array to keep record of what all are visited elements
2. Run a loop for k iteration , in every iterations find the next closest element

TIME COMPLEXITY : O(NK);
 */
public class NaiveSolution {

    public static void main(String[] args) {
        int arr[] = {10,30,5,40,38,80,70};
        int x = 35;
        int k = 3;

        System.out.println(" The "+k+" closest element for "+x+" are : ");
        printKClosest(arr, x, k);
    }


    public static void printKClosest(int[]arr, int x, int k){
        int n = arr.length;
        boolean visited[] = new boolean[n];

        //run for k iterations
        for(int i=0; i<k ;i++){ //-> O(k)
            int min_diff = Integer.MAX_VALUE;
            int min_diff_idx = -1;

            //in every iteration find closest element
            for(int j=0; j<n; j++){  //-> O(n)
                if(visited[j]==false && Math.abs(arr[j]-x)<min_diff){
                    min_diff = Math.abs(arr[j]-x);
                    min_diff_idx = j;
                }
            }

            System.out.print(arr[min_diff_idx]+" ");
            visited[min_diff_idx] = true;

        }


    }

}
