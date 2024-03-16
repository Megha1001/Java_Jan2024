package sorting.mergeSort.mergeTwoSortedArray;

/*
 * TIME COMPLEXITY : Theta(m+n)
 * AUX SPACE : O(1)
 */

public class EfficientMergeTwoSortedArray {
    public static void main(String args[]){
        int a[] = {10,15,20,20};
        int b[] = {1,12};

        System.out.println("Elements after merging two sorted array and after sorting it are :");
        printTwoSortedArray(a, b);
    }

    public static void printTwoSortedArray(int a[], int b[]){
        int m = a.length;
        int n = b.length;
        int i = 0; // to access a
        int j = 0; // to access b

        while(i<m && j<n){
            if(a[i] <= b[j]){ //print a and maintain the stability by having =
                System.out.print(a[i]+" ");
                ++i;
            }else{
                System.out.print(b[j]+" ");
                ++j;
            }
        }

        //print remaning elements of a
        while(i<m){
            System.out.print(a[i]+" ");
            ++i;
        }

        //print remaning elements of b
        while(j<n){
            System.out.print(b[j]+" ");
            ++j;
        }

    }

    
}
