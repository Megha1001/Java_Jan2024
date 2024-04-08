package stockSpanProblem.variations.nextGreaterOnRight;

/*
 * TIME COMPLEXITY : O(N^2)
 * AUX SPACE : O(1)
 */


public class NaiveSolution {

    public static void main(String args[]){
        int arr[] = {5,15,10,8,6,12,9,18};

        System.out.println("The nearest greatest element on righ side of each elements are : ");
        getAndPrintGreatestNearestElement(arr);
    }

    public static void getAndPrintGreatestNearestElement(int arr[]){
        int n = arr.length;

        if(n == 0){
            return;
        }

        for(int i=0; i<n; i++){
            int j;
            for (j=i+1; j<n; j++){
                if(arr[i]<arr[j]){
                    System.out.print(arr[j]+" ");
                    break;
                }
            }

            // if the current is greatest
            if(j==n){
                System.out.print(-1+" ");
            }
        }


    }
    
}
