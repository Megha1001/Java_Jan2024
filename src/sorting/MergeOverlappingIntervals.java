package sorting;

import java.util.Arrays;

/*
TIME COMPLEXITY : O(NLOGN)
 */
public class MergeOverlappingIntervals {
    public static void main(String args[]){
        Interval arr[] = {new Interval(5,10),new Interval(3,15),new Interval(18,30),new Interval(2,7)};

        System.out.println("After merging overlapping intevals the resultant intervals are :");
        findAndMergeOverlappingIntervals(arr, arr.length);
    }
    
    public static void findAndMergeOverlappingIntervals(Interval arr[], int n){
        Arrays.sort(arr); //O(NLOGN)

        int res = 0; //considering first as part of non overlapping array

        for(int i=1; i<n; i++){ //O(N)

            if(arr[i].st <= arr[res].end){
                //overlapping
                //modify the res
                arr[res].st = Math.min(arr[i].st, arr[res].st);
                arr[res].end = Math.max(arr[i].end, arr[res].end);
            }else{
                //non overlapping
                ++res;
                arr[res] = arr[i]; //next comparision should be done with this.
            }
        }

        for (int i = 0; i <= res; i++)  
        System.out.print(  "[" + arr[i].st + ", " + arr[i].end + "] ");  

    }

}


class Interval implements Comparable<Interval> {

    int st;
    int end;

    Interval(int st, int end){
        this.st = st;
        this.end = end;
    }

    @Override
    public int compareTo(Interval o) {
        return this.st - o.st; //Natural sorting
    }
}