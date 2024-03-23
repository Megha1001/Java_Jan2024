package matrix.findElementInRowAndColumnWiseSorted2DArray;

/*
 * Approach :
 * Begin from the bottom left corner
 * if x is sam, print the position and return
 * if(x <top left || x>bottom right) --> NOT FOUND ---> OPTIMIZATION
 * if x is smaller , move left
 * if x is greater, move down
 *
 *
 * TIME COMPLEXITY : O(R+C)
 */
public class EffSolutionConsiderBottomLeftOptimized {

    public static void main(String []args){
        int mat[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int x = 29;
        int R = mat.length;
        int C = mat[0].length;
        System.out.println("The element "+x+" is present at ");
        findPosition(mat, R, C, x);
    }

    public static void findPosition(int arr[][], int R, int C, int x){
        int i = R-1, j = 0;

        if(x <arr[0][0] || x > arr[R-1][C-1]){
            System.out.print("Not found");
            return;
        }

        while(i >=0 && j < C){
            int element = arr[i][j];
            if(element == x){
                System.out.print("("+i+","+j+")");
                return;
            }else if(element > x){
                //go up -> shift row
                --i;
            }else{
                //go right and shift column
                ++j;
            }
        }

        System.out.print("Not found");
    }

}
