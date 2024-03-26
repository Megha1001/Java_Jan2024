package hashing.countDistinctElementsInEveryWindow;

/*
 * TIME COMLEXITY : O((n-k)*k*k)
 */

public class NaiveSolution2 {
    

    public static void main(String []args){
        // int []arr = {10,20,20,10,30,40,10};
        int arr[] = new int[]{10, 10, 5, 3, 20, 5};
        int k = 4;
        System.out.println("Priting the distinct elment count of every window of size "+k+" : ");
        printDistinctElementsInEveryWindowOfSizeK(arr, k);
    }


    public static void printDistinctElementsInEveryWindowOfSizeK(int arr[], int k){
        int n = arr.length;

        for(int i=0; i<=n-k; i++){
            int count = 0;

            //for every k elements with starting index as i
            for(int j=0; j<k; j++){ //why < since j is zero indexed
                //for every element of j check if it encountered earlier for this current k window , if so break the loop otherwise add it to count
                boolean flag = false; //to check for duplicate
                for(int l=0; l<j; l++){ //offset should be i for every k window with starting index as i
                    if(arr[i+j] == arr[i+l]){ //i+j, is basically considering every element of j loop all elements of every kth windows, //why i+l , since we have to check for all preceding elements of current window that are less than the current element of current window 
                        //we are considering
                        flag = true;
                        break;
                    }
                }

                if(!flag){
                    ++count;
                }
            }
            System.out.println(count);

        }

    }
}
