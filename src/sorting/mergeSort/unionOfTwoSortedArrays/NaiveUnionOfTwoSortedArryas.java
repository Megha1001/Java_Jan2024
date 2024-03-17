package sorting.mergeSort.unionOfTwoSortedArrays;

import java.util.Arrays;

public class NaiveUnionOfTwoSortedArryas {
    public static void main (String[] args) 
    {
        int a[] = new int[]{3,8,10};
        int b[] = new int[]{2,8,9,10,15};
        
        int m = a.length;
        int n = b.length;
	    printUnion(a,b,m,n);
        
    }

    public static void printUnion(int a[], int b[], int m, int n){
        int temp[] = new int[m+n];

        //copy elements of a into temp
        for(int i=0; i<m; i++){
            temp[i] = a[i];
        }

        //copy elements of b into temp
        for(int i=0; i<n; i++){
            temp[i+m] = b[i];
        }

        //sort -> COMPLEXITY : O((m+n)log(M+N))
        Arrays.sort(temp);

        for(int i=0; i<(m+n); i++){
            if(i>0 && temp[i-1]==temp[i]){
                //already considered
                continue;
            }

            System.out.print(temp[i]+" ");
        }
    }
}
