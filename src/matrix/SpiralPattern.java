package matrix;

public class SpiralPattern {
    

    public static void main(String []args){
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        System.out.println("The spiral print of given array is");
        int R = arr.length;
        int C = arr[0].length;
        printSpiral(arr, R, C);
    }

    public static void printSpiral(int [][]arr, int R, int C){

        int top = 0;
        int right = C-1;
        int bottom = R-1;
        int left = 0;

        while(top <= bottom && left <= right){

            //print top : from left to right keeping row same
            for(int i=left; i<=right; i++){
                System.out.print(arr[top][i]+" ");
            }
            ++top;

            //print right from top to bottom : considering column as same
            for(int i=top; i<=bottom; i++){
                System.out.print(arr[i][right]+" ");
            }
            --right;

            //print bottom : from right to left(reverse order) keeping row as same
            if(top <= bottom){
                for(int i=right; i>=left; i--){
                    System.out.print(arr[bottom][i]+" ");
                }
            }
            --bottom;

            //print left : from bottom to top keeping column as same
            if(left<=right){
                for(int i = bottom; i >= top; i--){
                    System.out.print(arr[i][left]+" ");
                }
            }
            ++left;

        }

    }
}
