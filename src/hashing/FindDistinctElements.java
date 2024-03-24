package hashing;
/*
 * TIME COMPLEXITY : Theta(M+N)
 * AUX SPACE : Theta(M+N)
 */

import java.util.HashSet;

public class FindDistinctElements {
    public static void main(String args[]){
        int arr1[] = new int[]{2, 8, 3, 5, 6};
        int arr2[] = new int[]{4, 8, 3, 6, 1};

        System.out.println("the count of distinct elements are :"+findDistinctElements(arr1, arr2));
    }

    public static int findDistinctElements(int a1[], int a2[]){
        HashSet<Integer> h = new HashSet<>();

        for(int i=0; i<a1.length; i++){
            h.add(a1[i]);
        }

        for(int i=0; i<a2.length; i++){
            h.add(a2[i]);
        }

        return h.size(); 
    }
}
