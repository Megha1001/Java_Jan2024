package tree.binarySearchTrees.seflBalancingTrees.ceilLeft;

import java.util.TreeSet;

/*
TIME COMPLEXITY : O(NLogN)
 */


public class EfficientSolutionUsingTreeSet {
    public static void main(String[] args) {
        int arr[] ={2,8,30,15,25,12};
        System.out.println(" The ceil on left side of every element is : ");
        findCeil(arr);
    }

    public static void findCeil(int[]arr){
        TreeSet<Integer> t = new TreeSet<>();
        //for first element
        System.out.print("-1 ");
        t.add(arr[0]);

        for(int i=1; i< arr.length; i++){ // O(N)
            if(t.ceiling(arr[i])!=null){ //Ceil -> O(logN)
                System.out.print(t.ceiling(arr[i])+" ");
            }else{
                System.out.print("-1 ");
            }
            t.add(arr[i]);
        }
    }
}
