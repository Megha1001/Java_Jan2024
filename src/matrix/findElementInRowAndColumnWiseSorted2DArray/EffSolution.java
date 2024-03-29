package matrix.findElementInRowAndColumnWiseSorted2DArray;

/*
 * Approach : 
 * Begin from the right corner
 * if x is sam, print the postiion and return
 * if x is smaller , move left
 * if x is greater, move down
 * 
 *
 * TIME COMPLEXITY : O(R+C)
 */
public class EffSolution {

    public static void main(String []args){
        int mat[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int x = 29;
        int R = mat.length;
        int C = mat[0].length;
        System.out.println("The element "+x+" is present at ");
        findPosition(mat, R, C, x);
    }

    public static void findPosition(int arr[][], int R, int C, int x){
        int i = 0; int j = C-1;

        while(i < R && j>=0){
            int curr = arr[i][j];
            if(curr==x){
                System.out.print("("+i+","+j+")");
                return;
            }else if(curr > x){
                --j;
            }else{
                ++i;
            }
        }

        System.out.print("Not found");
    }
    
}
