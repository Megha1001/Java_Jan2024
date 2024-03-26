package hashing.morethanNByKOccurrences;


/*
 * TIME COMPLEXITY : O(NLogN)
 * AUX SPACE : O(1)
 * 
 * APPROACH : 
 * 1. sort the array
 * 2. count occurrence and print the element that has n/k > occurrence.
 */


 import java.util.Arrays;

public class NaiveSolution {

    public static void main(String args[]){
        int arr[] = {10,10,20,30,20,10,10};
        int n = arr.length;
        int k = 2;

        System.out.println("Elements that has more than n/k occurrences are : ");
        printElements(arr, n, k);

    }


    public static void printElements(int arr[], int n, int k){

        //sort the array
        Arrays.sort(arr); // [10,10,10,10,20,20,30] //O(nLogN)

        //count of elements
        int i=1, count=1;
        while(i<n){  //Theta(N)

            while(i<n && arr[i]==arr[i-1]){
                ++count;
                ++i; // will come out when we find first 20, i=4
            }

            if(count > n/k){
                System.out.println(arr[i-1]);
            }
            
            count = 1;
            ++i; //for next count --> again incrementing since we have already intialize count=1 means the first occurrence of 20 is already taken care

        }

    }
    
}
