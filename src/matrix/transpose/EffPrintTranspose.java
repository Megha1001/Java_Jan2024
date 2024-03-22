package matrix.transpose;

public class EffPrintTranspose {
    
    public static void main(String args[]){
        int arr[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
        //corner case
//        int arr[][] = {{1,2,3,4}};

        //corner case
//        int arr[][] = {{1},
//                {2},
//                {3},
//                {4}};

        int R = arr.length;
        int C = arr[0].length;

        findTranspose(arr, R, C);

        for(int i=0; i< R; i++){
            for(int j=0; j<C; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
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
}
