package sorting.mergeSort.countInversion;

public class EfficientCountInversion {
    public static void main (String[] args) 
    {
        int arr[] = new int[]{2,4,1,3,5};
        
        int n = arr.length;
	    System.out.print(countInv(arr,0,n-1));
        
    }


    public static int countInv(int arr[], int l, int r){
        int count = 0;
        if(r>l){
            int m = l+ (r-l)/2;

            count += countInv(arr, l, m);
            count += countInv(arr, m+1, r);
            count += mergeAndCount(arr, l, m, r);

        }

        return count;
    }


    public static int mergeAndCount(int arr[], int l, int m, int h){
        int count = 0;

        int n1 = m-l+1;
        int n2 = h-m;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for(int i=0; i<n1; i++){
            left[i] = arr[i+l];
        }

        for(int i=0; i<n2; i++){
            right[i] = arr[i+m+1];
        }

        int i=0, j=0, k=l;

        while(i<n1 && j<n2){
            if(left[i] <= right[j]){
                //ignore
                arr[k++] = left[i++];
            }else{
                //inversion
                arr[k++] = right[j++];
                count += n1-i;
            }
        }

        while(i<n1){
            arr[k++] = left[i++];
        }


        while(j<n2){
            arr[k++] = right[j++];
        }

        return count;
    }
}
