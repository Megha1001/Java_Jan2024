package sorting.sortArrayWithThreeTypesOfValues;

/*
 * TIME COMPLEXITY : Theta(N)
 * AUX SPACE : Theta(1)
 * One traversal
 */
public class DutchNationalFlagAlgorithm {
    public static void main(String args[]){
        int arr[] = {0,1,2,1,1,2};

        System.out.println("Array after sorting is :");
        sort(arr, arr.length);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void sort(int arr[], int n){
        //pointing to the postion considering for sorting
        int l = 0;
        int m = 0;
        int h = n-1;

        while(m <= h){

        
            if(arr[m] == 0){
                //swap
                int temp = arr[l];
                arr[l] = arr[m];
                arr[m] = temp;

                //we are sure that arr[l] =1;
                ++l;
                ++m;
            }

            else if(arr[m]==1){
                ++m;
            }

            else{//2
                //we are not sure what arr[h] will contain hence will not be incrementing mid
                //swap
                int temp = arr[h];
                arr[h] = arr[m];
                arr[m] = temp;

                --h;
            }

        }
    }
    
}
