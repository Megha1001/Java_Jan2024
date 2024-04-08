package stockSpanProblem.variations.findNearestGreaterOnLeft;

/*
 * TIME COMPLEXIty : O(N^2)
 */
public class NaiveApproach {

    public static void main(String args[]){
        int arr[] = {15,10,18,12,4,6,2,3};

        System.out.println("The nearest greatest element on left side of each elements are : ");
        getAndPrintGreatestNearestElement(arr);

    }

    public static void getAndPrintGreatestNearestElement(int [] arr){
        int n = arr.length;
        if(n == 0 ){
            return; //no element to print result for
        }
        //print result for 1st element as it always be -1
        System.out.print(-1+" ");

        for(int i=1; i<arr.length; i++){
            int j;
            for(j=i-1; j>=0; j--){
                if(arr[j] > arr[i]){
                    System.out.print(arr[j]+" ");
                    break;
                }
            }

            //for elements who is greatest till now
            if(j==-1){
                System.out.print(-1+" ");
            }
        }
    }
    
}
