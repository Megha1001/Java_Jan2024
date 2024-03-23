package matrix.findElementInRowAndColumnWiseSorted2DArray;

public class NaiveSolution {

    public static void main(String []args){
        int mat[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int x = 29;
        int R = mat.length;
        int C = mat[0].length;
        System.out.println("The element "+x+" is present at ");
        findPosition(mat, R, C, x);
    }

    public static void findPosition(int arr[][], int R, int C, int x){
        for(int i=0; i<R; i++){
            for(int j=0 ; j<C; j++){
                if(x == arr[i][j]){
                    System.out.print("("+i+","+j+")");
                    return;
                }
            }
        }
        System.out.print("Not found");
    }
    
}
