package stockSpanProblem.variations.nextGreaterOnRight;

/*
 * 15 18 12 12 12 18 18 -1
 */
import java.util.Stack;

public class EffSolutinUsingStack {
    public static void main(String args[]){
        int arr[] = {5,15,10,8,6,12,9,18};

        System.out.println("The nearest greatest element on righ side of each elements are : ");
        getAndPrintGreatestNearestElement(arr);
    }

    public static void getAndPrintGreatestNearestElement(int []arr){
        int n = arr.length;
        if(n==0){
            return;
        }

        //print for last element
        System.out.print(arr[n-1]+" ");
        Stack<Integer> s = new Stack<>();

        for(int i=n-2; i>=0; i--){
            int j;
            for(j=i+1; j<n; j++){
                if(arr[i] < arr[j]){
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
            //for element whose right side doesnot contain any greater element
            if(j==n){
                System.out.print(-1+" ");
            }
        }

    }
}
