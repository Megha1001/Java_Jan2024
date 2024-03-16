package sorting.mergeSort;

/*
 * TIME COMPLEXITY : Theta(N)
 * AUX SPACE : : Theta(N)
 */
public class MergeFunctionOfMergeSort {
    
    public static void main (String[] args) 
    {
        int a[] = new int[]{10,15,20,40,8,11,15,22,25};
	    int l=0,h=8,m=3;
        
        merge(a,l,m,h);
	    for(int x: a)
	        System.out.print(x+" ");
        
    }
    

    public static void merge(int a[], int l, int m, int h){
        int n1 = m-l+1; //size for left array
        int n2 = h-m; //size for right array not having +1 since we dont have to include m

        // array declartation for left and right
        int left[] = new int[n1];
        int right[] = new int[n2];

        //populate left array
        for(int i=0; i<n1; i++){
            left[i] = a[i+l]; //offset should be low
        }

        //populate right array
        for(int i=0; i<n2; i++){
            right[i] = a[i+m+1]; //copy from m+1 as an offset
        }

        //reference for left and right array
        int i = 0;
        int j = 0;

        //reference for original array
        int k = l;

        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                //keep left
                a[l++] = left[i++];
            }else{
                //keep right
                a[l++] = right[j++];
            }
        }

        //copying remaining element of left array
        while(i < n1){
            //keep left
            a[l++] = left[i++];
        }

        //copying remaining element of right array
        while(j < n2){
            //keep right
            a[l++] = right[j++];            
        }

    }
}
