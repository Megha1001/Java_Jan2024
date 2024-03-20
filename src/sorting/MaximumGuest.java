package sorting;
import java.util.Arrays;

/*
 * TIME COMPLEXITY : O(NLOGN)
 */
public class MaximumGuest {

    public static void main(String args[]){

        int arrival[] = {900, 600, 700};
        int departure[] = {1000, 800,730};

        System.out.println("Max guests that we can meet is/are "+findMaxGuest(arrival, departure));
    }

    public static int findMaxGuest(int arr[], int dep[]){
        Arrays.sort(arr); //NlogN
        Arrays.sort(dep); //NlogN
        
        int n = arr.length;
        int i = 1; //arrival count;
        int j = 0 ; //departure count;

        int current = 1; //current guest;

        int res = 1; //max guest till now

        while(i < n && j < n){ //O(N+N) = O(N)
            //is the next is arrival
            if(arr[i] <= dep[j]){ //the guest came just now has arrival time <= dep of previous
                //increase number of guest
                ++current;
                ++i; //arrival
            }else{
                //departure
                --current;
                ++j;
            }
            res = Math.max(res, current);
        }

        return res;

    }

    
}
