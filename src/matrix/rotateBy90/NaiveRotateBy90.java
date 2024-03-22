package matrix.rotateBy90;
/*
 * TIME COMPLEXITY : O(R*C)
 * AUX SPACE : O(R*C)
 */
public class NaiveRotateBy90 {

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

        int temp [][] = new int[r][c];

        for(int i=0; i<r; i++){
            for(int j=c-1; j>=0; j--){
                temp[c-1-j][i] = arr[i][j];
            }
        }

        //copying to original
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = temp[i][j];
            }
        }
    }
    
}
