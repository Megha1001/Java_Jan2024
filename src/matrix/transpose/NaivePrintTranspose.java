package matrix.transpose;

public class NaivePrintTranspose {
    
    public static void main(String args[]){
//        int arr[][] = {{1,2,3,4},
//                       {5,6,7,8},
//                       {9,10,11,12},
//                       {13,14,15,16}};
        //corner case
//        int arr[][] = {{1,2,3,4}};

        //corner case
        int arr[][] = {{1},
                {2},
                {3},
                {4}};

        int R = arr.length;
        int C = arr[0].length;

        int transpose[][] = findTranspose(arr, R, C);

        for(int i=0; i< transpose.length; i++){
            for(int j=0; j<transpose[0].length; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static int[][] findTranspose(int [][]arr, int r, int c){
        int transpose [][] = new int [c][r];

        if(r==1){
            for(int i=0; i<c; i++){
                transpose[i][0]= arr[0][i];
            }
        }else if(c==1){
            for(int i=0; i<r; i++){
                transpose[0][i] = arr[i][0];
            }
        }else{
            for(int j=0; j<c; j++){
                for(int i=0; i<r; i++){
                    transpose[j][i] = arr[i][j];
                }
            }
        }

        return transpose;
    }
}
