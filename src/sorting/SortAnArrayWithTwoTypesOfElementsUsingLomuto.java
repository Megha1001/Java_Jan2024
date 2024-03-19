package sorting;

public class SortAnArrayWithTwoTypesOfElementsUsingLomuto {
    public static void main (String[] args) 
    {
        int arr[] = new int[]{13,-12,18,-10,0,0,1,-10};
        
        int n = arr.length;
        
        sort(arr,0,n-1);
	
	    for(int x:arr)
            System.out.print(x+" ");
        
    }

    public static void sort(int arr[],int l, int h){

        int i = -1;
        int p = 0;

        for(int j =0; j<=h; j++){
            if(arr[j] < p){
                ++i;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

    }
}
