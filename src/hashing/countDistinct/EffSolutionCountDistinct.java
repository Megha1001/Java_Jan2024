package hashing.countDistinct;

import java.util.HashSet;
/*
 * TIME COMPLEXITY : O(N)
 */

public class EffSolutionCountDistinct {
    public static void main(String args[]){
        int arr[] ={10,20,10,20,30};
        HashSet<Integer> h = new HashSet<>();
        for(int a : arr){
            h.add(a);
        }
        System.out.println("Number of distinct elements in given array is "+h.size());
    }
}
