package matrix;
/*
 * TIME COMPLEXITY : Theta(R*C)
 */
public class SnakePattern {

    public static void main(String args[]){
        int [][] mat = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        System.out.println("Printing elements of array in snake pattern");

        printSnakePattern(mat);
    }

    public static void printSnakePattern(int [][]arr){
        int r = arr.length;
        int c = arr[0].length;
        
        for(int i=0; i<r; i++){
            if(i%2==0){
                for(int j=0; j<c; j++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int j=c-1; j>=0; j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

    }
    
}
