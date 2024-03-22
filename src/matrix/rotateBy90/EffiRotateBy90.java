package matrix.rotateBy90;
/*
 * APPROACH : Find transpose then rotate individual columns
 */

public class EffiRotateBy90 {
    public static void main(String []args){
        int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        int R = arr.length;
        int C = arr[0].length;
        System.out.println("Array after rotating it by 90 degres");
        rotateBy90(arr, R, C);

        for(int i=0; i< R; i++){
            for(int j=0; j<C; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void rotateBy90(int [][]arr, int r, int c){
        findTranspose(arr, r, c);
        rotateIndividualColumn(arr, r, c);
    }

    public static void findTranspose(int [][]arr, int r, int c){
        for(int i=0; i<r; i++){
            for(int j=i+1; j<c; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void rotateIndividualColumn(int [][]arr, int r, int c){
        for(int i=0; i<r; i++){
            int low = 0; int high = r-1;
            while(low < high){
                int temp = arr[low][i];
                arr[low][i] = arr[high][i];
                arr[high][i] = temp;
                ++low;
                --high;
            }
        }
    }
}
