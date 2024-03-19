package sorting;

public class SortAnArrayWithTwoTypesOfElementsUsingHoares {
    public static void main (String[] args) 
    {
        int arr[] = new int[]{13,-12,18,-10};
        
        int n = arr.length;
        
        sort(arr,n);
	
	    for(int x:arr)
            System.out.print(x+" ");
        
    }

    //Hoare's partition

    public static void sort(int arr[], int n){
        int p = 0; //since we have to put -ve elements then postive element , that means sort around zero
        int i = -1;
        int j = n;

        while(true){
            do{
                ++i;
            }while(arr[i] < p);

            do{
                --j;
            }while(arr[j] >=p);

            if(i>=j){
                return;
            }

            //swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; 
        }

    }
}
