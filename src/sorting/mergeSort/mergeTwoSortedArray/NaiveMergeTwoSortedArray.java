package sorting.mergeSort.mergeTwoSortedArray;

/*
 * TIME COMPLEXITY : O((m+n)LogN)
 * AUX SPACE : Theta(M+N)
 */
import java.util.Arrays;

public class NaiveMergeTwoSortedArray {
    public static void main(String args[]){
        int a[] = {15,10,20,20};
        int b[] = {1,12};

        System.out.println("Elements after merging two sorted array and after sorting it are :");
        int c[] = mergeTwoSortedArray(a, b);
        for(int i=0; i<c.length; i++){
            System.out.print(c[i]+" ");
        }
    }

    public static int[] mergeTwoSortedArray(int a[], int b[]){
        int m = a.length;
        int n = b.length;
        int c[] = new int[m+n];

        //copy elements of array a into c
        for(int i=0; i<m; i++){
            c[i] = a[i];
        }

        //copy elements of array b into c
        for(int i=0; i<n; i++){
            c[i+m] = b[i];
        }

        //Now sort
        Arrays.sort(c); // takes O((m+n)LogN)

        return c;
    }
    
}
