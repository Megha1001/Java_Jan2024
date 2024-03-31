package sorting.mergeSort.countInversion;

/*
 * TIME COMPLEXITY : O(N^2)
 * Inversion : when i<j and arr[i]>arr[j]
 */
public class NaiveCountInversion {

    public static void main (String[] args) 
    {
        int arr[] = new int[]{2,4,1,3,5};
        
	    System.out.print(countInv(arr));
        
    }
    

    public static int countInv(int a[]){
        int count = 0;
        int n = a.length;

        for(int i=0; i<n-1;i++){//run until n-2 since we have to consider j for n-1(last element)
            for(int j=i+1; j<n; j++){
                if(a[i] > a[j]){
                    ++count;
                }
            }

        }

        return count;

    }
}
