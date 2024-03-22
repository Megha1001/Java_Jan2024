package matrix.boundaryElements;

public class PrintBoundaryElements {
    public static void main(String []args){
        // int arr[][] = {{1,2,3,4},
        //                {5,6,7,8},
        //                {9,10,11,12},
        //                {13,14,15,16}};

        // //corner case
        // int arr[][] = {{1,2,3,4}};

        //corner case
        int arr[][] = {{1},
                       {2},
                       {3},
                       {4}};

        int R = arr.length;
        int C = arr[0].length;

        System.out.println("Boundary elements are ");
        printBoundaryElements(arr, R, C);
    }
    

    public static void printBoundaryElements(int arr[][], int r, int c){

        //corner cases
        if(r==1){
            for(int i =0; i<c; i++){
                System.out.print(arr[0][i]+" "); 
            }
        }else if (c==1){
            //one column
            for(int i=0; i<r; i++){
                System.out.print(arr[i][0]+" ");
            }
        }else{
        
            //first row i=0 , j = change
            for(int j=0; j<c; j++){
                System.out.print(arr[0][j]+" ");
            }

            //last column, j = c-1, i=changing
            for(int i=1; i<r; i++){
                System.out.print(arr[i][c-1]+" ");
            }

            //last row, i=r-1, j =changing
            for(int j=c-2; j>=0; j--){
                System.out.print(arr[r-1][j]+" ");
            }

            //first row from bottom to top, c = 0, i=changing dont print [0][0]
            for(int i=r-2; i>0; i--){ //dont include[0][0]
                System.out.print(arr[i][0]+" ");
            }
        }

    }
}
