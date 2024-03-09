package arrays;
/*
NOt in place
TIME COMPLEXITY : O(N)
AUXILIARY SPACE : O(D)
 */
public class LeftRotateByDPositionApp2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int d = 3;
        lRotateByD(arr, d);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void lRotateByD(int arr[], int d){
        int tempArr[] = new int[d];
        //copy the element upto d index to tempArr
        for(int i=0; i<d; i++){
            tempArr[i]= arr[i];
        }
        //transfer the elements from d->n to 0->d
        for(int i=d; i<arr.length; i++){
            arr[i-d] = arr[i];
        }

        //transfer the elements from tempArr 0->d to d->n in original array
        for(int i=0; i<d; i++){
            arr[arr.length-d+i]=tempArr[i];
        }
    }
}
