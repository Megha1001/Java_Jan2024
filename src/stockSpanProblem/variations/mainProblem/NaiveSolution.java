package stockSpanProblem.variations.mainProblem;

/*
 * We have a series of N daily price quotes for a stock and we need to calculate the span of the stock's price for all N days.
 * The span Si of the stock's price on a given day i is defined as the maximum number of consecutive days just before the given day,
 * for which the price of the stock on the curr day is less than its price on the given day(price <=  current day)
 * 
 * For example :  {30,20,25,28,27,29};
 * Span : 1, 1, 2, 3, 1, 5.
 * TIME COMPLEXITY : O(N^2)
 */

public class NaiveSolution {

    public static void main(String args[]){
        int arr[] = {30,20,25,28,27,29};

        System.out.println("The stock span for all the days are :");
        findAndPrintSpan(arr);
    }

    public static void findAndPrintSpan(int arr[]){
        int n = arr.length;
        System.out.print(1+" "); // the stock span for curr day will always be 1.
        for(int i=1; i<n; i++){
            int span = 1;
            for(int j= i-1; j>=0; j--){
                if(arr[i]>=arr[j]){
                    ++span;
                }else{
                    break;
                }
            }
            System.out.print(span+" ");
        }
    }
    
}
